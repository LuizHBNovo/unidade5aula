import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int voto = 0;
    int a= 0;
    int b= 0;
    int c= 0;
    int d= 0;
    int e= 0;
    int f= 0;
    int i= 0;
    do{
        System.out.println("Informe o número do seu candidato:(digite 0 pra encerrar a votação) ");
        voto = sc.nextInt();
        switch (voto){
            case 1:
                a++;
                break;
            case 2:
                b++;
                break;
            case 3:
                c++;
                break;
            case 4:
                d++;
                break;
            case 5:
                e++;
                break;
            case 6:
                f++;
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        if(voto >= 1 && voto <= 6){
            i++;
        }
        if(voto == 0){
            break;
        }
    }while(voto > 0);
    System.out.println("O candidato 1 teve um total de "+a+" votos");
    System.out.println("O candidato 2 teve um total de "+b+" votos");
    System.out.println("O candidato 3 teve um total de "+c+" votos");
    System.out.println("O candidato 4 teve um total de "+d+" votos");
    System.out.println("Votos nulos teve um total de "+e+" votos");
    System.out.println("Votos em branco teve um total de "+f+" votos");
    double percentualNulos = (e*100)/i;
    System.out.println("O percentual de votos nulos foi de " +percentualNulos+"% de um total de "+i+" votos");
    double percentualBrancos = (f*100)/i;
    System.out.println("O percentual de votos brancos foi de " +percentualBrancos+"% de um total de "+i+" votos");
    sc.close();
    }
}
