import java.util.Scanner;;
public class Uni5Exe13 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    

     System.out.println("Digite o numero total de reabastecimentos feitos");
     int reabastecimentos = sc.nextInt();
     System.out.println("Quantos km rodados tinha no inicio da viagem");
     double kmInicial = sc.nextDouble();
     double kmlegal =0;
     double Kmlitro = 0;
     double kmatual =0;
     double medialitro =0;
     double distanciaPercorrida =0;
     double Totalcombustivel =0;
    
     
     for (int i = 1; i <= reabastecimentos; i++) {
         System.out.println("Digite o total de litro adicionadas da parada " + i);
         double litros = sc.nextDouble();
         System.out.println("Digite quantos km está no odometro na parada " + i);
          kmatual = sc.nextDouble();
          
          kmlegal = kmatual- kmInicial;
         Kmlitro = litros/kmlegal;
         kmInicial = kmatual;
          System.out.println("A quilometragem atual é " + Kmlitro);
          Kmlitro++;
          distanciaPercorrida +=kmlegal;
          Totalcombustivel += litros;

     }
     medialitro = distanciaPercorrida/Totalcombustivel;
     System.out.println("A media por litro da viagem toda é " + medialitro);
     sc.close();
   }
    
}


