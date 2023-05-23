public class Uni5Exe03 {
    public static void main(String[] args) {
        

        
        double soma = 0; 
        

        for(int contador = 1; contador <= 100; contador ++){
            double divisao = 1/(contador * 1.0);
            soma += divisao;    
        }
        System.out.println(soma);
    }
}
