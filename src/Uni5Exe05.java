import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int numero = 8;
        if(n > 2){
        for(int contador = 0; contador < n; contador++){
            System.out.println(numero);
            contador++;
            if(contador < n){
                System.out.println(numero + 2);
            }
                numero *= 2;
        }
    }
    teclado.close();
    }
}
