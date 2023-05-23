import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int numero,numeromenor = Integer.MAX_VALUE,soma=0, media= 0;
        int I = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Digite o "+(i+1)+"° número inteiro");
            numero = sc.nextInt();
            if(numero < 0){
                if(numero < numeromenor){
                    numeromenor = numero;
                }
            }
            if(numero > 0){
                 I ++;
                soma += numero;
                media = soma/I;
            }
        }
        System.out.println("O menor número negativo é: "+numeromenor);
        System.out.println("A média de números positivos é: "+media);
        sc.close();
    }
}
