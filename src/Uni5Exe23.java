import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome = "";
        
        
        int i = 0;

        while(true){
            i++;
            System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            String resposta = sc.next();
            double salario = 0;
            double totalVendas = 0;
            double precoUnitario = 0;
            int j = 0;
            double qtdProduto = 0;
            double percentual = 0;
            if(resposta.equals("s")){
                System.out.println("Informe o nome do "+i+"º vendedor");
                nome = sc.next();
                System.out.println("Informe o salário do vendedor: ");salario = sc.nextDouble();
                System.out.println("Informe quantos produtos "+nome+" vendeu");
                
                qtdProduto = sc.nextDouble();        
                if(qtdProduto > 0){
                    
                    while(j < qtdProduto){
                        j++;
                        System.out.println("Informe o preço unitário do "+j+"º produto ");
                        precoUnitario = sc.nextDouble();
                        totalVendas += precoUnitario;
                        percentual += precoUnitario * 0.3;
                    }
                    salario += percentual;
                    System.out.println("O total de comissão que "+nome+" teve foi de R$" +percentual);

                }      
                System.out.println("Funcionário "+nome);
                System.out.println("total de vendas(em R$):"+totalVendas);
                System.out.println("Salário com comissão: "+salario);
               
            }else{
                break;
            }
        }
        sc.close();
    }
}
