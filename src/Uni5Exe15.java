import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double media;
        String nome ="";
        double soma;

        while(!nome.equals("fim") || !nome.equals(" ")){
            
            System.out.println("Informe o nome do aluno");
            nome = sc.next();
        if(!nome.equals("fim")){
            System.out.println("Informe a nota da primeira prova:");
            double nota3 = sc.nextDouble();
            System.out.println("Informe a nota da segunda prova:");
            double nota4 = sc.nextDouble();
            soma = (nota3 + nota4);
            media = soma/2;
            System.out.println("A média de "+nome+" ficou em "+media);
        }else{
            System.exit(0);
        }
    }
    sc.close();
    }

    }

