import java.util.Scanner;

    public class Uni5Exe12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número inteiro positivo: ");
            int n = sc.nextInt();
            sc.close();
    
            int valor = 1;
            for (int linha = 1; linha <= n; linha++) {
                for (int coluna = 1; coluna <= linha; coluna++) {
                    System.out.print(valor + " ");
                    valor++;
                }
                System.out.println();
            }
        }
    }
