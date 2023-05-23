import java.text.DecimalFormat;

public class Uni5Exe22 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double salario = 2030;
        double percentual = 0.015;
        double percentualnovo = 0;
        int i = 1997;
        while(true){
            i++;
            percentual = percentual * 2;
            percentualnovo = salario*percentual;
            salario += percentualnovo;
            if(i == 2023){
                System.out.println(df.format(salario));
            }
        }
    }
}
