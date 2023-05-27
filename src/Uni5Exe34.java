import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int opcao = 0;
        String nome = "";
        int i = 0;
        do{
        int diarias = 0;
        double valorNormal = 0;
        double taxaServiço = 0;
        double total = 0;

        System.out.println("---------------------------");
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("(1)-Encerrar a conta de um Hóspede");
        System.out.println("(2)-Verificar o número de contas encerradas");
        System.out.println("(3)-Sair");
        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Informe o nome do hóspede: ");
                nome = sc.next();
                System.out.println("Informe o número de diárias que do hóspede: ");
                diarias = sc.nextInt();
                valorNormal = diarias * 50;
                if(diarias < 15){
                    taxaServiço = diarias * 7.50;
                    total = valorNormal + taxaServiço;
                }
                if(diarias == 15){
                    taxaServiço = diarias * 6.50;
                    total = valorNormal + taxaServiço;
                }
                if(diarias > 15){
                    taxaServiço = diarias * 5.00;
                    total = valorNormal + taxaServiço;
                }
                System.out.println("O valor que "+nome+" deverá pagar é de R$"+df.format(total));
                i++;
                break;
            case 2:
                System.out.println("O número de encerramentos é de "+ i);
                break;
            case 3:
                System.out.println("Até logo!");
                break;
        }
        }while(opcao != 3);
        sc.close();
    }
}
