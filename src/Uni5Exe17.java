import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int inscricao = 0;
        int inscricaoAlta = 0;
        int inscricaoMenor = 0;
        double altura = 0;
        double maioraltura = Integer.MIN_VALUE;
        double menoraltura = Integer.MAX_VALUE;
        double alutraMedia = 0;
        double soma = 0;
        int i = 0;

        while(true){
            System.out.println("(Para cancelar o cadastro digite 0 na inscrição)");
            System.out.println("Informe o número de inscrição: ");
            inscricao = sc.nextInt();
            if(inscricao != 0){
            System.out.println("Informe a altura: ");
            altura = sc.nextDouble();
                i ++;
                soma +=  altura;
                if(altura > maioraltura){
                    maioraltura = altura;
                    inscricaoAlta = inscricao;
                }
                if(altura < menoraltura){
                    menoraltura = altura;
                    inscricaoMenor = inscricao;
                }
                
            }
            if(inscricao == 0){
                alutraMedia = soma/i;
                System.out.println("O atleta do numéro "+inscricaoAlta+ " é o atleta mais alto com "+df.format(maioraltura)+" de altura");
                System.out.println("O atleta do numéro "+inscricaoMenor+ " é o atleta mais baixo com "+df.format(menoraltura)+" de altura");
                System.out.println("A media de altura dos atletas é de "+ df.format(alutraMedia));
                break;
            }
        }
        sc.close();
    }
}
