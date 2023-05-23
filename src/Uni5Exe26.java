import java.util.Scanner;

public class Uni5Exe26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double ValorNaoPagar = 0;
        double distancia = 0;
        int i = 0;
        int j = 0;
        int f = 0;
        System.out.println("Informe o valor no qual Astolfo se nega a pagar: ");
        ValorNaoPagar = sc.nextDouble();
        double ValorPedagio2 = 0;
        while(true){
        double ValorPedagio = 0;
        System.out.println("Informe o valor do próximo pedágio: ");
        ValorPedagio = sc.nextDouble();
        if(ValorPedagio < 0){
            break;
        }
        ValorPedagio2 = ValorPedagio;
        j++;
        System.out.println("Informe a distância do próximo pedágio: ");
        distancia = sc.nextDouble();
        if(ValorNaoPagar < ValorPedagio){
            i++;
        }
        if(distancia > 150 && ValorPedagio <= ValorNaoPagar){
            f++;
        }
    }
    
    if(ValorNaoPagar <= ValorPedagio2){
        System.out.println(i+ " trechos com valor acima do qual ele nega-se a pagar");
        }       
        if(j > 0){
            System.out.println(j+" quantidade de trechos informados");
        }
        if(distancia > 150 && ValorPedagio2 <= ValorNaoPagar){
            System.out.println(f+" trechos acima de 150km com valor aceito por ele");
        }
        
        sc.close();
}   
    }
