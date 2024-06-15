package excepcionais;

import java.util.Scanner;

public class zipCode {
    public static void main(String[] args) {
        formatZipCode();
    }
    public static void formatZipCode(){
        String cep;
        ExceptionZipCode cepInvalid = new ExceptionZipCode();

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o cep: ");
        cep = ler.next();

        if(cep.length() != 8){
            System.err.println(cepInvalid.invalidZipCode);
        }else{
            System.out.println("Cep válido!");
        }
    }
}
