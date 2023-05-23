import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");

        System.out.println("Informe a massa inicial do material(em Kg):");
        double massa = sc.nextDouble();
        int i = 0;
        double divisao = 0;
        divisao = massa/2;
        //double minutos;
        //double segundos;
        while(true){
            i++;
            divisao -= divisao/2;
            if(divisao < 0.0005){
                //if(i > 60){
                //minutos = i/60;
                //segundos = i - 60;
                System.out.println("Foram necessários "+i+" segundos para que a massa ficasse a baixo de 0,5 gramas");
                }    
                System.out.println("A massa inicial é de "+massa+" Kg");
                System.out.println("A massa final é de: "+df.format(divisao)+" em Kg");
               System.out.println("Foram necessários "+i+" segundos para que a massa ficasse a baixo de 0,5 gramas");
               break;
            }
            sc.close();
        }
        
    }
