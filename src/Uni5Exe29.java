import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int divisao = 0;
        int valor = 0;
        int resposta = 1;
        while(resposta == 1){
        System.out.println("Informe um valor: ");
        valor = sc.nextInt();
        divisao = (valor/20);
        System.out.println(divisao +" Notas de R$20,00");
        valor = valor%20;
        divisao = (valor/10);
        System.out.println(divisao +" Notas de R$10,00");
        valor = valor%10;
        divisao = (valor/5);
        System.out.println(divisao +" Notas de R$5,00");
        valor = valor%5;
        divisao = (valor/2);
        System.out.println(divisao +" Notas de R$02,00");
        valor = valor%2;
        divisao = (valor/1);
        System.out.println(divisao +" Notas de R$01,00");
        valor = valor%1;
        System.out.println("Deseja informar outro valor? 1(Sim)/2(Não)");
        resposta = sc.nextInt();
        if(resposta == 2){
            break;
        }
        }
        sc.close();
    }
}
