import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double valorCompra = 0;
        double desconto1 = 0;
        double desconto2 = 0;
        double total1 = 0;
        double total2 = 0;
        double totalFinal = 0;
        double descontoF2 = 0;
        double descontoF1 = 0;

        while(true){
            System.out.println("Informe o valor da compra: ");
            valorCompra = sc.nextInt();

            if(valorCompra != 0){
                if(valorCompra > 500){
                    desconto1 = 0.2*valorCompra;
                    descontoF1 = valorCompra - desconto1;
                    total1 += descontoF1;
                    System.out.println("O total da compra ficou em R$"+descontoF1+" com desconto de 20%");
                }
                if(valorCompra <= 500){
                    desconto2 = (15*100)/valorCompra;
                    descontoF2 = valorCompra - desconto2;
                    total2 += descontoF2;
                    System.out.println("O total da compra ficou em R$"+descontoF2+" com desconto de 15%");
                }
                totalFinal = (total1 + total2);
            }
            if(valorCompra == 0){
                System.out.println("O faturamento total do dia foi de R$"+df.format(totalFinal));
                break;
            }
        }
        sc.close();
    }
}
