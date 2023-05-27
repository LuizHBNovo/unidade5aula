import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de alunos: ");
        int n = sc.nextInt();
        sc.nextLine();

        int maisde20 = 0;
        String igual18 = "";

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o nome do aluno " + i + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade do aluno " + i + ": ");
            int idade = sc.nextInt();
            sc.nextLine();
            
            if (idade == 18) {
                igual18 += nome + ", ";
            }

            if (idade > 20) {
                maisde20++;
            }
        }
    System.out.println("Os alunos que tem 18 anos são: "+igual18);        
    System.out.println("O número de alunos com idade acima de 20 anos é: " + maisde20);
sc.close();
    }
}
