import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    
        double numeromaior = Integer.MIN_VALUE, numeromenor = Integer.MAX_VALUE
        , numero;
        int n = scan.nextInt();
        
        for(int i= 0; i < n; i ++ ){
            System.out.println("Digite o "+(i+1)+"º número real");
            numero = scan.nextDouble();
        if(numero > numeromaior){
            numeromaior = numero;
        }
        if(numero > numeromenor){
            numeromenor = numero;
        }
    }
    System.out.println("O maior número é "+numeromaior);
    System.out.println("O menor número é "+numeromenor);
        scan.close();

    }
}

