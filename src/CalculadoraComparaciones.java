import java.util.Scanner;
public class CalculadoraComparaciones {
    public static void main(String[] args) {
        byte si = 1;
        while (si == 1) {
            Scanner leer = new Scanner(System.in);
            System.out.println("1 para saber la resta de un numero");
            System.out.println("2 para dividir");
            byte  cod = leer.nextByte();
            System.out.println("INGRESE DOS NUMEROS : ");
            double num1 = leer.nextDouble();
            double num2 = leer.nextDouble();
            double Div = 0;
            if (cod==1){System.out.println("la reta del numero "+num1 % num2+" es de ");}
            else if(cod ==2){
                Div = num1/num2 ;}
                System.out.println("el resultado de la dicion es de  "+ Div);
                System.out.println("quieres continiar 1 si o 2 no");
                si = leer.nextByte();
            }
System.out.println("finalizo");
    }
}
