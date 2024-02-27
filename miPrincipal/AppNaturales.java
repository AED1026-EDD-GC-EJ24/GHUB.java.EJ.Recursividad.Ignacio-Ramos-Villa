package miPrincipal;
import java.util.Scanner;

public class AppNaturales{
    public static void menu(){
        System.out.println("****************");
        System.out.println("Numeros naturales");
        System.out.println("*****************");
        Scanner scaner = new Scanner(system.in);
        System.out.println("Proporciona numero");
        int n = scaner.nextInt();
        System.out.println("Version iterativa");
        muestraNaturalesIte(n);
        System.out.println("Version recursiva");
        muestraNaturalesIte(n); 
}
public static void muestraNaturalesIte(int n){
    for(int i=1;i<=n;i++){
        System.out.println(i);
    }
}
public static void muestraNaturalesRec(int n){
    if(n>0)
    muestraNaturalesRec(n-1);
    System.out.println(n);
}
}







