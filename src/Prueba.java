import java.util.Scanner;

public class Prueba {
   public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    byte si = 1;

   while (si == 1) {

       System.out.println("ingrese nombre");
       String Nombre = leer.nextLine();
       System.out.println("ingrese edad");
       byte Edad1 = leer.nextByte();
       if (Edad1 > 17) {System.out.println(Nombre + " es mayor de edad");} 
       else {System.out.println(Nombre + " es menor de edad");}
       System.out.println("quieres volver a intentar 1: si ; 2: NO");
       si = leer.nextByte();
       
    }
    
    System.out.println("Programa finalizado.");
    leer.close();
   }
}
