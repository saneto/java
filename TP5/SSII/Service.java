package essai1;

public class Service{
	private int Port;
	private boolean Actif;
	
	public Service(int Port, boolean Actif){
		this.Port = Port;
		this.Actif = Actif;
	}
	
	public void setActif(boolean Actif)	{	this.Actif = Actif;	}
	public boolean getActif()			{	return Actif;		}
	public int getPort()				{	return Port;		}
}
