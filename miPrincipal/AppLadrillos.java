package miPrincipal;
public class AppLadrillos{
    public static void menu(){
        //solucion iterativa
        /* 
        for(int i=0;i<10;i++){
        dibujarHilera();
        }
        /* */
        //solucion recursiva
        dibujarPared();
    }
    public static void dibujarPared()
    {
        dibujarPared();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxx");
    }
    public static void dibujarHilera(){
        System.out.println("xxxxxxxxxxxxxxxxxxxxx");
    }
}