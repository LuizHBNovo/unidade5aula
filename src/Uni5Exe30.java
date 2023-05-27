
import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor inicial N: ");
        int N = sc.nextInt();

        System.out.println("Digite o valor de decremento K: ");
        int K = sc.nextInt();

        System.out.println("Digite o tamanho da mochila M: ");
        int M = sc.nextInt();

        int somaElementosNaMochila = 0;
        int somaElementosForaDaMochila = 0;
        int novoM = 0;
        while (true) {
            somaElementosForaDaMochila = N - M;
            if(M < 0){
                novoM = M *(-1);
                System.out.println(novoM);
                break;
            }else{
                System.out.println(M);
                break;
            }
        }
        System.out.println("Elementos a serem colocados na mochila:");
        System.out.println(N);
        while (true) {
            N -= K;
            if(N == M){
                somaElementosNaMochila = N;
                break;
            }
            if(N < M){
                somaElementosNaMochila = N;
                break;
            }
        }
        sc.close();
        System.out.println("Soma dos elementos na mochila: " + somaElementosNaMochila);
        System.out.println("Soma dos elementos fora da mochila: " + somaElementosForaDaMochila);
    }
}
