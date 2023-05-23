
public class Uni5Exe02 {
    public static void main(String[] args) {
        
        int contador1 = 0;
        int contador2 = 0;
        for(int contador = 1; contador <= 100; contador++ ){    
            if(contador % 2 == 0){
                contador1 += contador;
            }else{
                contador2 += contador;
            }
        }
        System.out.println(contador1);
        System.out.println(contador2);
    }
}
