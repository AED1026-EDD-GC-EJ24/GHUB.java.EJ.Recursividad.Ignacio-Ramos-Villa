package unidadII;

public class AppFibRecursivo40a50{

    public static void main(String[]args){


    }
    public static void menu(){
        System.out.println("==============================");
        Performance p = new Performance();

        int desde = 40;
        int hasta = 50;
        double ant = -1;
        for(int i=desde;i<hasta;i++){
            //comenzamos tomando el tiempo
            p.start();
            //invocamos a la funcion recursiva
            double f = Appfibonacci.fibonaciRec(i);
            //detenemos el tiempo
            p.stop();
            System.out.println("f("+i+")=                                                                                                                                        );
        }

    }
}