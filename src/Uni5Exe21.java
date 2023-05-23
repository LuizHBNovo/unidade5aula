public class Uni5Exe21 {
    public static void main(String[] args) {
        double ze = 1.10;
        double chico = 1.50;
        int i = 0;

        while( chico >= ze){
            i++;
            chico += 0.02;
            ze += 0.03;
        }
        System.out.println("Serão necessários "+i+" anos para que Zé seja maior que chico");
    }
}
