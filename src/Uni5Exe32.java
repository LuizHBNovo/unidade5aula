    
import java.util.Scanner;

public class Uni5Exe32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o dia da semana em que o primeiro dia do mês cai (1=Domingo, 2=Segunda, ..., 7=Sábado): ");
        int primeiroDiaMes = sc.nextInt();
        
        System.out.print("Informe o número de dias que o mês possui: ");
        int numeroDias = sc.nextInt();

        if (primeiroDiaMes < 1 || primeiroDiaMes > 7) {
            System.out.println("Dia da semana inválido.");
            
        }
        System.out.println("Dom Seg Ter Qua Qui Sex Sab");
        for (int i = 1; i < primeiroDiaMes; i++) {
            System.out.print("    ");
        }
     
        for (int dia = 1; dia <= numeroDias; dia++) {
            System.out.printf("%3d ", dia);   
            if ((dia + primeiroDiaMes - 1) % 7 == 0) {
                System.out.println();
            }
        }
        if ((numeroDias + primeiroDiaMes - 1) % 7 != 0) {
            System.out.println();
        }
        sc.close();
    }
}
