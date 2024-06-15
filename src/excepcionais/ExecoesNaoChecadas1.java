package excepcionais;

public class ExecoesNaoChecadas1 {
    public static void main(String[] args) {
        Object obj = null;
        String valueObject = excecaoChecada(obj);

        System.out.println(valueObject);
    }

    public static String excecaoChecada(Object obj) {
        String result;

        try {   
            return result = obj.toString();
        } catch (NullPointerException ex) {
            System.err.println(ex);   
            return "";
        }
    }
}