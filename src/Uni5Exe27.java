import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaABRIL = 0;
        int turnoMatutino = 0;
        int turnoVespertino = 0;
        double totalDia = 0;
        double ValorPrimeira15 = 0;
        double ValorSegunda15 = 0;
        double maiorProducao = Integer.MIN_VALUE;
        double maiorProducaoTurno = Integer.MIN_VALUE;
        double maiorProducaoTurno2 = Integer.MIN_VALUE;
        double maiorProducaoManha = 0;
        double maiorProducaoTarde = 0;

        while(true){

        System.out.println("Informe o dia do mês de abril que será calculado o valor diário");
        diaABRIL = sc.nextInt();
        if(diaABRIL >= 1 && diaABRIL <=30){
            System.out.println("Informe a quantidade de peças produzidas no turno matutino:");
            turnoMatutino =sc.nextInt();
            System.out.println("Informe a quantidade de peças produzidas no turno vespertino:");
            turnoVespertino =sc.nextInt();
            totalDia = turnoMatutino + turnoVespertino;
            System.out.println("O valor que o Funcionário receberá  no dia será de: R$");
            if(diaABRIL >=1 && diaABRIL <= 15){
                if(totalDia > 100){
                    if(turnoMatutino >= 30 && turnoVespertino >= 30){
                        ValorPrimeira15 = totalDia * 0.80;
                        System.out.println("R$"+ValorPrimeira15+"(valor recebido)");
                    }else{
                        ValorPrimeira15 = totalDia * 0.50;
                        System.out.println("R$"+ValorPrimeira15+"(valor recebido)");
                    }
                }else {
                ValorPrimeira15 = totalDia * 0.50;
                System.out.println("R$"+ValorPrimeira15+"(valor recebido)");
                }
            }
            if(diaABRIL >= 16 && diaABRIL <= 30){
                ValorSegunda15 = turnoMatutino * 0.40;
                ValorSegunda15 += turnoVespertino * 0.30;
                System.out.println("R$"+ValorSegunda15+"(valor recebido)");
            }
            if(turnoMatutino > turnoVespertino){
                maiorProducaoTurno = turnoMatutino;
                System.out.println("O funcionário produziu mais no turno matutino com "+maiorProducaoTurno+" peças produzidas");
            }else{
                maiorProducaoTurno = turnoVespertino;
                System.out.println("O funcionário produziu mais no turno vespertino com "+maiorProducaoTurno+" peças produzidas");
            }
            if(turnoMatutino > turnoVespertino){
                maiorProducaoManha += turnoMatutino;
            }else{
                maiorProducaoTarde += turnoVespertino;
            }
            
        }else{
            System.out.println("Dia inválido");
        }
        System.out.println("Novo funcionário (1.sim 2.não)?");
        int resposta = sc.nextInt();
        if(resposta == 2){
            break;
        }
        }
        sc.close();
        if(maiorProducaoManha > maiorProducaoTarde){
            maiorProducaoTurno2 = maiorProducaoManha;
            System.out.println("O período que mais foi produzido nesses dias foi o matutino com "+maiorProducaoTurno2+" peças produzidas");
        }else{
            maiorProducaoTurno2 = maiorProducaoTarde;
            System.out.println("O período que mais foi produzido nesses dias foi o vesperitno com "+maiorProducaoTurno2+" peças produzidas");
        }
        if(totalDia > maiorProducao){
            maiorProducao = totalDia;
            System.out.println("No dia "+diaABRIL+" ocorreu a maior produção com "+maiorProducao+" peças produzidas");
        }
    }
}
