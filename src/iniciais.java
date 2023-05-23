import java.util.Scanner;

public class iniciais {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String iniciais = " ";

        String nome = teclado.nextLine();
        iniciais += nome.charAt(0);
        

        for( int i = 0; i < nome.length(); i++){
            if(nome.charAt(i) == ' ')
                iniciais += nome.charAt(i+1);
        }
        System.out.println(iniciais);
    }
}
