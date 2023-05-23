
import java.util.Scanner;;
public class Uni5Exe14 {

   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    /*Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. Para cada mercadoria
     ele tem o nome, o preço de compra (PC) e o preço de venda (PV). Descreva um algoritmo que:
     escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), onde o percentual de lucro 
     é calculado da seguinte forma: % = (PV - PC) / PC * 100;
     determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total. */
     int lucro10 =0;
     int lucro1020 =0;
     int lucro20 = 0;
     String nomes = "";
     double compratotal = 0;
     double vendatotal = 0;
     double lucrototal = 0;

     
     
     
     
     
     for (int i = 1; i <= 2; i++) {
      System.out.println("Informe o nome da mercadoria " + i);
      nomes = teclado.next();
      System.out.println("Informe o PC da mercadoria " + i);
      double pc = teclado.nextDouble();
      System.out.println("Informe o PV da mercadoria " + i);
      double pv = teclado.nextDouble();
      double lucro = (pv - pc) / pc*100;
      compratotal += pc;
      vendatotal += pv;
      lucrototal = vendatotal - compratotal;
      if (lucro <10) {
         lucro10 = lucro10 +1;

      }else if (lucro>=10 && lucro<=20) {
         lucro1020= lucro1020+1;
      }else if (lucro>20) {
         lucro20 = lucro20 +1;
      }

     }
     System.out.println(lucro10 + " tiveram menos que 10% de lucro, " + lucro1020 + " tiveram entre 10% a 20% de lucro e " + lucro20 + " tiveram mais que 20% de lucro");
     System.out.println("o preço de compra total foi de " + compratotal + " o preço de venda total foi de " + vendatotal +  " e o lucro total foi de " + lucrototal);
     teclado.close();


    }
}
