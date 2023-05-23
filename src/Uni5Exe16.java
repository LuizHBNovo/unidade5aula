import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
      
        double altura;
        int i = 0;
        int j= 0;
        double mediaF = 0;
        double mediaF2 = 0;

        while(true){
            System.out.println("Informe sexo");
            char sexo = sc.next().charAt(0);
            System.out.println("Informe a altura");
            altura = sc.nextDouble();
        if(altura != 0){
            if(sexo == 'f' || sexo == 'F'||sexo == 'm' || sexo == 'M')
            j++;
            mediaF2 += altura;
        }
        if(altura != 0){
            if(sexo == 'f' || sexo == 'F'){
            i ++;
            mediaF += altura;
            }
        }
        if(altura == 0){
            double totalF = mediaF/i;
            double totalG = mediaF2/j;
            System.out.println("A média de altura do grupo é: "+df.format(totalG));
            System.out.println("A média de altura  das mulheres é "+df.format(totalF));
            break;
    }
    }
    sc.close();
    }
    }

