import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jogadorD = 0;
        int jogadorE = 0;
        int D = 0;
        int E = 0;

        while(true){
            System.out.println("Informe o ponto do jogador da Direita: ");
            jogadorD = sc.nextInt();
            D += jogadorD;
            
            System.out.println("Informe o ponto do jogador da Esquerda: ");
            jogadorE = sc.nextInt();
            E += jogadorE;

            if(jogadorD == 21){
                double jogadorFD = jogadorD -2;
                if(jogadorFD >= jogadorE){
                    break;
                }
            }
            if(jogadorE == 21){
            double jogadorFE = jogadorE -2;
            if(jogadorFE >= jogadorD){
                break;
                }
            }
            
            if(jogadorD > 21){
                double jogadorFD = jogadorD -2;
                if(jogadorFD >= jogadorE){
                    break;
                }
            }
            if(jogadorE > 21){
            double jogadorFE = jogadorE -2;
            if(jogadorFE >= jogadorD){
                break;
                }
            }
        }
        sc.close();
        
        if(jogadorD == 21){
                double jogadorFD = jogadorD -2;
                if(jogadorFD >= jogadorE){
                    System.out.println("jogador da Direita venceu com "+D+" pontos");
                }
        }
        if(jogadorE == 21){
            double jogadorFE = jogadorE -2;
            if(jogadorFE >= jogadorD){
                System.out.println("jogador da Esquerda venceu com "+E+" pontos");
            }
        }
        if(jogadorD > 21){
            double jogadorFD = jogadorD -2;
            if(jogadorFD >= jogadorE){
                System.out.println("jogador da Direita venceu com "+D+" pontos");
            }
        }
        if(jogadorE > 21){
            double jogadorFE = jogadorE -2;
            if(jogadorFE >= jogadorD){
                System.out.println("jogador da Esquerda venceu com "+E+" pontos");
                }
        }
    }
}
