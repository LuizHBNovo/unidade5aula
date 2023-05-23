

public class Uni5Exe10 {
    public static void main(String[] args) {
        int j = 0;
        int n = Integer.MAX_VALUE;
        int pontencia = 0;
        int numero  = 0; 
        
            for(int i = 0; i < n; i++){
                numero ++;
                
                int divisao = numero/100;
                int multiplicacao = divisao * 100;
                int subtração =  numero - multiplicacao;
                int soma = subtração + divisao;
                pontencia = soma * soma;
                if(pontencia == numero){
                    j++;
                    if(j < 11)
                      System.out.println(numero);
                
                }
            }
        }
}

