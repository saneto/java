package ssii;

import java.util.*;
import java.io.*;

public class ListOfNumbers {
	private List<Integer> lst;
	private static final int SIZE = 10;
	
	public ListOfNumbers(){
		lst = new ArrayList<Integer>(SIZE);
		for(int i=0; i<SIZE; i++){
			lst.add(new Integer(i));
		}
	}
	
	public void writeLst(){
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileWriter("OutFile.txt"));
		} catch (IOException e) {
			out.close();
			System.out.println("Veuillez créer le fichier et y assigner les valeurs.");
		}
		
		for(int i=0; i<SIZE+1; i++){
			out.println("Value at : "+i+" = "+lst.get(i));
		}
	}
	
	public static void main (String [] args){
		ListOfNumbers lst = new ListOfNumbers();
		lst.writeLst();
	}
}
