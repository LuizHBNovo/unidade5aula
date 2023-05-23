import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NenhumDeNos =0;
        int CPM22 =0;
        int Skank =0;
        int JotaQuest =0;
        String votos = "s";
        int opcao = 0;
        int i = 0;
        double percentual1 = 0;
        double percentual2 = 0; 
        double percentual3 = 0;
        double percentual4 = 0;
        
        while(votos.equals("s")){
            i ++;
            System.out.println("Vote na banda que você prefere: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    NenhumDeNos ++;
                    break;
                case 2:
                    CPM22 ++;
                    break;
                case 3:
                    Skank ++;
                    break;
                case 4:
                    JotaQuest ++;
                    break;
                default:
                    System.out.println("Valor inválido");
            }
            System.out.println("mais um voto: s (SIM) / n (NÃO)?");
            votos = sc.next();
            if(votos.equals("n")){
                
            percentual1 = (NenhumDeNos*100)/i;  
            percentual2 = (CPM22*100)/i;
            percentual3 = (Skank*100)/i;
            percentual4 = (JotaQuest*100)/i;
            if(NenhumDeNos>CPM22 && NenhumDeNos > JotaQuest && NenhumDeNos > Skank){
                System.out.println("Nenhum de nós é o vencedor");
            }
            if(JotaQuest>CPM22 && JotaQuest > NenhumDeNos && JotaQuest > Skank){
                System.out.println("Jota Quest é o vencedor");
            }            
            if(Skank>CPM22 && Skank > JotaQuest && Skank > NenhumDeNos){
                System.out.println("Skank é o vencedor");
            }            
            if(CPM22>NenhumDeNos && CPM22 > JotaQuest && CPM22 > Skank){
                System.out.println("CPM22 é o vencedor");
            }            
                break;
            }
        }
        sc.close();
        System.out.println("Nenhum de nós teve um total de "+NenhumDeNos+" pontos");
        System.out.println("CPM22 teve um total de "+CPM22+" pontos");
        System.out.println("Skank teve um total de "+Skank+" pontos");
        System.out.println("Jota Quest teve um total de "+JotaQuest+" pontos");
        System.out.println("O percentual de votos pro grupo Nenhum de Nós foi de: "+percentual1+"%");
        System.out.println("O percentual de votos pro grupo CPM22 foi de: "+percentual2+"%");
        System.out.println("O percentual de votos pro grupo Skank foi de: "+percentual3+"%");
        System.out.println("O percentual de votos pro grupo Jota Quest foi de: "+percentual4+"%");        
    }
}
