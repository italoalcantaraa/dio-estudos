public class Produto {
    private String name;
    private Double price;
    private Long code;

    public Produto(String name, Double price, Long code){
        this.name = name;
        this.price = price;
        this.code = code;
    }

    @Override
    public String toString() {
        String information = String.format("\n[Nome: %s, Preço: %s, Código: %s]", name, price, code);
        return information;    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    
}
