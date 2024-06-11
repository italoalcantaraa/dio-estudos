package metodos;

public class teste {
    public static void main(String[] args){
        double dividir = dividir(20,0);
    }   

    public static double dividir(int... numeros){
        double resultado = numeros[0] / numeros[1];
        return resultado;
    }
    
}
