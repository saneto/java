package essai1;

import java.util.*;


public class Serveur extends NomIp {
	private String Machine;
	private Service sPort;
	HashMap<Integer, Service> hPort;
	
	public Serveur(String Machine, String NomIp, String Adresse){
		super(NomIp, Adresse);
		this.setMachine(Machine);
		hPort = new HashMap<Integer, Service>();
	} 

	public boolean addService(int port){
		Collection<Service> co = hPort.values();
		Iterator<Service> it = co.iterator();
		boolean existe = false;
		while(it.hasNext())	if(it.next().getPort() == port)	existe = true;

		if(!existe){
			sPort = new Service(port, false);
			hPort.put(sPort.getPort(), sPort);
		}
		return !existe;
	}

	public boolean delService(int port){
		Collection<Service> co = hPort.values();
		Iterator<Service> it = co.iterator();
		boolean existe = false;
		while(it.hasNext())	if(it.next().getPort() == port)	existe = true;
		
		if(existe)	hPort.remove(port);
		return existe;
	}

	public boolean isService(int port){
		if(hPort.containsKey(port)) return true;
		return false;
	}

	public boolean activeService(int port){
		Collection<Service> co = hPort.values();
		Iterator<Service> it = co.iterator();
		boolean existe = false;
		
		while(it.hasNext()){
			Service tmp = it.next();
			if(tmp.getPort() == port){
				existe = true;
				tmp.setActif(true);
			}
		}
		return existe;
	}

	public boolean desactiveService(int port){	
		Collection<Service> co = hPort.values();
		Iterator<Service> it = co.iterator();	
		boolean existe = false;
		
		while(it.hasNext()){
			Service tmp = it.next();
			if(tmp.getPort() == port){
				existe = true;
				tmp.setActif(false);
			}
		}
		return existe;
	}

	public void activeTout(){
		Collection<Service> co = hPort.values();
		Iterator<Service> it = co.iterator();
		
		while(it.hasNext())	it.next().setActif(true);
	}

	public void desactiveTout(){
		Collection<Service> co = hPort.values();
		Iterator<Service> it = co.iterator();
		
		while(it.hasNext())	it.next().setActif(false);
	}
	
	public void etatServices(){
		Collection<Service> co = hPort.values();
		Iterator<Service> it = co.iterator();
		String msg = "";
		while(it.hasNext())
		{
			Service tmp = it.next();
			if(tmp.getActif()) msg = "on";
			if(!tmp.getActif()) msg = "off";
			
			System.out.println("Service " + tmp.getPort() + " is " + msg);
		}
	}

	public String getMachine() {
		return Machine;
	}

	public void setMachine(String machine) {
		Machine = machine;
	}
}