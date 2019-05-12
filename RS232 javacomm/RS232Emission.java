import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;

public class RS232Emission
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
 System.out.println("Port n�"+i++);
 System.out.println("\tNom\t:\t"+port.getName());
 String type = null;
 if (port.getPortType() == CommPortIdentifier.PORT_SERIAL){
	 type = "Serie";
	 nomPortSerie= port.getName();
 }
  else type = "Parall�le";
 System.out.println("\tType\t:\t"+type);
 String etat = null;
 if (port.isCurrentlyOwned()) etat = "Poss�d� par "+port.getCurrentOwner();
 else etat = "Libre";
 System.out.println("\tEtat\t:\t"+etat+"\n");
 }

SerialPort serie = null;
try {
	 serie = (SerialPort) port.open(nomPortSerie,2000);
	 System.out.println("port libre");
	 
	 System.out.println("D�bit binaire : "+serie.getBaudRate());
	 System.out.println("Nombre de bits : "+serie.getDataBits());
	 System.out.println("Nombre de stop : "+serie.getStopBits());
	 int par = serie.getParity();
	 if (par==SerialPort.PARITY_NONE)System.out.println("Pas de parit�");
	 if (par==SerialPort.PARITY_ODD)System.out.println("Parit� impaire");
	 if (par==SerialPort.PARITY_EVEN)System.out.println("Parit� paire");
	 try {
		serie.setSerialPortParams(300, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
	
		 serie.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);
		 } catch (UnsupportedCommOperationException e) {	}
	 
	 try {
		 	String message = "bonjour la rs232 qui fonctionne enfin\n";
			serie.getOutputStream().write(message.getBytes());
			serie.getOutputStream().flush();
			System.out.println("Envoye");
		} catch (IOException e) {
			
			System.out.println("Error 4: " + e.getMessage());
		}

	 serie.close();
}
catch (PortInUseException e2) {
		 System.out.println("port occupe");
	 }	


}
}
