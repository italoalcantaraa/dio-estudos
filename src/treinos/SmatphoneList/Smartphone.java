package treinos.SmatphoneList;

public class Smartphone {
    private String serialNumber;
    private String name;

    public Smartphone(String serialNumber, String name){
        this.serialNumber = serialNumber;
        this.name = name;
    }

    public String getSerialNumber(){
        return serialNumber;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        String information = String.format("{Código do produto: %s, Nome: %s }",serialNumber,name);
        return information;
    }
}
