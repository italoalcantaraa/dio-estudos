package excepcionais;

public class Aula2 {
    public static void main(String[] args) {

        try {
            Number num = Double.valueOf("i2.72");    
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erro!");
        }
        }
}
