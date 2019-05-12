package boiteAuxLettres;

import java.util.*;

public class BAL {
	Vector <String> messages = new Vector <String>();
		
	public synchronized void deposer(String message){
		messages.addElement(message);
	}
	
	public synchronized String retirer(){
		if(!messages.isEmpty()){
			String rtrn = messages.firstElement();
			messages.removeElementAt(0);
			return rtrn;
		}
		return null;
	}
}
