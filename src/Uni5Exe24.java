import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o limite diário de peso(em kg)");
        double limitePeso = sc.nextDouble();
        double pesoPeixe = 0;
        double pesoF = 0;

        while(true){
            System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
            String resposta = sc.next();
            if(resposta.equals("s")){ 
            System.out.println("Informe o peso do peixe em gramas:");
            pesoPeixe = sc.nextDouble();
            pesoF += pesoPeixe / 1000;

            if(pesoF > limitePeso){
                break;
            }
            if(resposta.equals("n")){
                break;
            }
        }
    }
    sc.close();
    System.out.println("O peso total da pesca é "+pesoF+"Kg");
    }
}
