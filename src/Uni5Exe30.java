import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 0;
        int K = 0;
        int M = 0;
        int total = 0;
        System.out.println("Informe o tamanho da mochila");
        M = sc.nextInt();

        while(total < M){
            System.out.println("Informe o valor de N ");
            N = sc.nextInt();
            System.out.println("Informe o valor de K");
            K = sc.nextInt();
            total += N - K;
            if(total == M){
                break;
            }

        }
    }
}
