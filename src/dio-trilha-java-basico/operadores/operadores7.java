package operadores;

public class operadores7 {
    public static void main(String[] args) {
        boolean teste1 = true;
        boolean teste2 = false;
        String result;

        result = teste1 && teste2 ? "Ambas são verdadeiras" : "Falso";
        System.out.println("1 - " + result);

        result = teste1 || teste2 ? "Uma os ambas são verdadeiras" : "Falso";
        System.out.println("2 - " + result);
        
    }
}
