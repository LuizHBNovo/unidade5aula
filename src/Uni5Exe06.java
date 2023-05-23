import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0;

        for(int i = 1; i <= 20; i++){
            System.out.println("Digite a altura:");
            double altura = teclado.nextDouble();
            soma += altura;
            if(i == 20){
            double divisao = soma/i;
            System.out.println(divisao); 
            }
        }
        teclado.close();
            
        }
    }

