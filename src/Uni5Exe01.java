import java.util.Scanner;

public class Uni5Exe01{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for(int contador = 1; contador <=20; contador++){
            int numeroLido = teclado.nextInt();
            if(numeroLido%2 == 0){
                System.out.println("Par");
            }else{
                System.out.println("ímpar");
            }
        }
        teclado.close();
    }

}