package metodos.exercitando;

public class User {
    public static void main(String[] args) {
        SmartTv televisao = new SmartTv();
        
        televisao.ligartTv();
        televisao.imprimirEstadoTv();

        televisao.mudarCanal(20);
        televisao.imprimirCanal();

        televisao.aumetarVolume();
        televisao.aumetarVolume();
        televisao.aumetarVolume();
        televisao.imprimirVolume();

        televisao.diminuirVolume();
        televisao.imprimirVolume();
    }
}
