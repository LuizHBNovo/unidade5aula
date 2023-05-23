import java.util.Scanner;

public class Uni5Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantas horas que a maquina ficou ligada ");
        int hora = sc.nextInt();

        int quebrados = 0;
        if(hora >= 2){
            quebrados = 3;
            for(int i = 0; i <= hora; i+=1){
                if(i>=3){
                quebrados = quebrados*3;
                }
            }
            }
            if(hora == 1){
                System.out.println("A máquina quebrou 1 biscoito");
            }else{
            System.out.println("A máquina quebrou "+quebrados+" biscoitos");
            }
    
    sc.close();
    }
}


