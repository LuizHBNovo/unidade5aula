import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NumeroCanal = 0;
        int i = 0;
        double soma1 = 0;
        double soma2 = 0;
        double soma3 = 0;
        double soma4 = 0;
        int j = 0;
        while(true){
            j++;
            System.out.println("Informe o canal selecionado na "+j+"º casa");
            NumeroCanal = sc.nextInt();
            if(NumeroCanal != 0){
                i ++;
                if(NumeroCanal == 4){
                    soma1 ++;
                }
                if(NumeroCanal == 5){
                    soma2 ++;
                }
                if(NumeroCanal == 9){
                    soma3 ++;
                }
                if(NumeroCanal == 12){
                    soma4 ++;
                }
            }
            if(NumeroCanal == 0){
                break;
            }
        }    
        sc.close();
        double conta1 = (soma1*100)/i;
        double conta2 = (soma2*100)/i;
        double conta3 = (soma3*100)/i;
        double conta4 = (soma4*100)/i;
        System.out.println("O percentual de audiência do canal 4 nessas "+i+" casas é de "+conta1+"%");
        System.out.println("O percentual de audiência do canal 5 nessas "+i+" casas é de "+conta2+"%");
        System.out.println("O percentual de audiência do canal 9 nessas "+i+" casas é de "+conta3+"%");
        System.out.println("O percentual de audiência do canal 12 nessas "+i+" casas é de "+conta4+"%");
        
    }
}
