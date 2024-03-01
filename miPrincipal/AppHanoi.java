package unidad II;

public class AppHanoi{
    public static void main(string arg[]){
        menu()
    }
    public static void menu(){
    system.out.println("*******************************")
    system.out.println("******Torres de Hanoi*****")
    system.out.println("*******************************")
    hanoi('A','B','C');
}

public static void hanoi(char varinicial,char varcentral, char varfinal, int n){
    if(n == 1)
    system.out.println("mover disco"+ n +"desde varilla "+varinicial + " a varilla "+varfinal)
    else
    hanoi(varinicial,varfinal,varinicial,n-1);

    system.out.println("Mover disco "+n+" desde varilla"+varinicial+" a varilla "+varfinal);

    hanoi(varcentral,varinicial)


}