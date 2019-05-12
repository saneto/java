package lesemployes;

public abstract class Employe
{
   private String name;
   private String address;
   private int number;
   public Employe (String name, String address, int number)   {
                 this.name = name ;
                 this.address = address ;
                 this.number = number ;
 }
 public abstract double calculPaye(double base);

 public void envoiCourrier()  {
          System.out.println("Envoyer un mail à " + name + "  " + address);
 }
 public String toString()  {
           return name + "  " + address + "  " + number;
}
public String getName()  { /*                 A coder            */
	return name ;
 }
 public String getAddress()  { /*             A coder             */
     return address ;
 
}
 public void setAddress(String newAddress) {
        address = newAddress;
}
 public int getNumber()  {
       return number;
 }
}