public class Uni5Exe04 {
    public static void main(String[] args) {
    
        double soma = 0;
        double denominador = 2; 
        double numerador = 3;
        double diferenca = 4;

    for(double i = 1; i <= 2;i++){
        double divisao = (numerador*1.0)/(denominador*1.0);
        soma += divisao;
        numerador += 2;
        denominador += diferenca;
        diferenca += 2;
    }
    System.out.println(soma);
    }
}


