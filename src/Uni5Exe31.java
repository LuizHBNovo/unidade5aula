import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();
        sc.close();

        System.out.println("Número\tDecomposiçao");

        for (int fator = 2; fator <= numero; fator++) {
            while (numero % fator == 0) {
                System.out.println(numero + "\t" + fator);
                numero /= fator;
            }
        }
    }
}