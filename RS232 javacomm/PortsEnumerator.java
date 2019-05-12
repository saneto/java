/* Ne pas oublier :
Placer rxtxParallel.dll et rxtxSerial.dll dans C:\Program Files\Java\jre7\bin

Bouton droit souris sur Projet/Propriétés/Chemin de compilation Java/Bibliothèques/Ajouter 
puis rechercher le ficher RXTXCOMM.jar et valider.

*/
import java.util.Enumeration;
import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
public class PortsEnumerator
{
public static void main(String[] args)
{
Enumeration ports = CommPortIdentifier.getPortIdentifiers();
int i = 1;
CommPortIdentifier port=null;
String nomPortSerie = null ;
while (ports.hasMoreElements())
 {
 port = (CommPortIdentifier) ports.nextElement();
 System.out.println("Port n°"+i++);
 System.out.println("\tNom\t:\t"+port.getName());
 String type = null;
 if (port.getPortType() == CommPortIdentifier.PORT_SERIAL){
	 type = "Serie";
	 nomPortSerie= port.getName();
 }
  else type = "Parallèle";
 System.out.println("\tType\t:\t"+type);
 String etat = null;
 if (port.isCurrentlyOwned()) etat = "Possédé par "+port.getCurrentOwner();
 else etat = "Libre";
 System.out.println("\tEtat\t:\t"+etat+"\n");
 }

SerialPort serie = null;
try {
	 serie = (SerialPort) port.open(nomPortSerie, 2000);
	 System.out.println("port libre");
	 
	 System.out.println("Débit binaire : "+serie.getBaudRate());
	 System.out.println("Nombre de bits : "+serie.getDataBits());
	 System.out.println("Nombre de stop : "+serie.getStopBits());
	 int par = serie.getParity();
	 if (par==SerialPort.PARITY_NONE)System.out.println("Pas de parité");
	 if (par==SerialPort.PARITY_ODD)System.out.println("Parité impaire");
	 if (par==SerialPort.PARITY_EVEN)System.out.println("Parité paire");
	 
 }
catch (PortInUseException e2) {
		 System.out.println("port occupe");
	 }	 
 }
}
