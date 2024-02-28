package miPrincipal;
import java.util.Scanner;

public class AppSumaDigitos{
    public static void menu(){
        System.out.println("****************");
        System.out.println("Suma Digitos");
        System.out.println("*****************");
        Scanner scaner = new Scanner(system.in);
        System.out.println("Proporciona numero");
        int n = scaner.nextInt();
        System.out.println("Version iterativa");
       System.out.println("Resultado = "+sumaDigitosIte(n));
        System.out.println("Version recursiva");
        System.out.println("Resultado = "+sumaDigitosRec(n));
}
}