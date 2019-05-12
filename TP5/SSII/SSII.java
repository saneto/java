package essai1;
import java.util.*;

public class SSII{
	HashMap<String, Serveur> hServ = new HashMap<String, Serveur>();
	
	public boolean addServeur(Serveur serv){
		int tailleD = hServ.size();
		hServ.put(serv.getNom(),serv);
		int tailleF = hServ.size();

		if(tailleD+1 == tailleF) return true;
		return false;
	}
	
	public boolean delServeur(Serveur serv){
		int tailleD = hServ.size();
		hServ.remove(serv.getNom());
		int tailleF = hServ.size();

		if(tailleD-1 == tailleF) return true;
		return false;
	}
	
	public boolean activeService(String nomIp, int port){
		if(srv(nomIp)!= null) return srv(nomIp).activeService(port);
		return false;
	}
	
	public boolean desactiveService(String nomIp, int port){
		if(srv(nomIp)!= null) return srv(nomIp).desactiveService(port);
		return false;
	}
	
	public boolean activeServeur(String nomIp){
		if(srv(nomIp)!= null){
			srv(nomIp).activeTout();
			return true;
		}
		return false;
	}
	
	public boolean desactiveServeur(String nomIp){
		if(srv(nomIp)!= null){
			srv(nomIp).desactiveTout();
			return true;
		}
		return false;
	}
	
	public boolean addService(String nomIp, int port){		
		if(srv(nomIp)!= null) return srv(nomIp).addService(port);
		return false;
	}
	
	public boolean delService(String nomIp, int port){
		if(srv(nomIp)!= null) return srv(nomIp).delService(port);
		return false;
	}
	
	private Serveur srv(String ip){
		return hServ.get(ip);
	}
}
