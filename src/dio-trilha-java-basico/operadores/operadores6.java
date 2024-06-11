package operadores;

import javax.naming.spi.DirStateFactory.Result;

public class operadores6 {
    public static void main(String[] args) {
        String name1 = "Italo", result;
        String name2 = new String("Italo");

        result = name1.equals(name2) ? "São iguais!" : "São diferentes!";
        System.out.println("1 - " + result);
        /*---------------------*/
        int n1 = 10;
        int n2 = 11;

        result = n1 != n2 ? "São diferentes!" : "São iguais!";

        System.out.println("2 - " + result);
    }
}
