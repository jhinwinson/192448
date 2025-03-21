import java.util.Scanner;
public class EjercicioTerrible {
   public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el nombre del primer estudiante:");
    String Nombre1 = leer.nextLine();
    System.out.println("Ingrese la edad:");
    byte Edad1 = leer.nextByte();
    leer.nextLine();
    System.out.println("Ingrese el nombre del segundo estudiante:");
    String Nombre2 = leer.nextLine();
    System.out.println("Ingrese la edad:");
    byte Edad2 = leer.nextByte();
    leer.nextLine();
    System.out.println("Ingrese el nombre del tercer estudiante:");
    String Nombre3 = leer.nextLine();
    System.out.println("Ingrese la edad:");
    byte Edad3= leer.nextByte();
    leer.nextLine();
    System.out.println("Ingrese el nombre del cuato estudiante:");
    String Nombre4 = leer.nextLine();
    System.out.println("Ingrese la edad:");
    byte Edad4 = leer.nextByte();
    leer.nextLine();
    System.out.println("Ingrese el nombre del quinto estudiante:");
    String Nombre5 = leer.nextLine();
    System.out.println("Ingrese la edad:");
    byte Edad5 = leer.nextByte();
    double promedio = (Edad1 + Edad2 + Edad3 + Edad4 + Edad5) / 5;
    System.out.println("Edad promedio de la edad de los estudiantes: " + promedio);
    
    if (Edad1 > 17) {System.out.println(Nombre1 + " es mayor de edad");} 
    else {System.out.println(Nombre1 + " es menor de edad");}
    if (Edad2 > 17) {System.out.println(Nombre2 + " es mayor de edad");} 
    else {System.out.println(Nombre2 + " es menor de edad");}
    if (Edad3 > 17) {System.out.println(Nombre3 + " es mayor de edad");} 
    else {System.out.println(Nombre3 + " es menor de edad");}
    if (Edad4 > 17) {System.out.println(Nombre4 + " es mayor de edad");} 
    else {System.out.println(Nombre4 + " es menor de edad");}
    if (Edad5 > 17) {System.out.println(Nombre5 + " es mayor de edad");}
    else {System.out.println(Nombre5 + " es menor de edad");}
    System.out.println("Programa finalizado.");
    leer.close();
   }
}
