package Collection_Framework_API.OpercacoesBasicas.exer7;

public class Cliente {
    private Integer id;
    private String name;
    private Integer age;
    private Long phoneNumber;

    public Cliente(Integer id, String name, Integer age, Long phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        String information = String.format("[Id: %s, Nome: %s, Idade: %s, Número de telefone: %s]", id, name, age, phoneNumber);
        return information;
    }
}
