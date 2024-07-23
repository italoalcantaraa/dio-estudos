package treinos.Consumer.Pessoa;

public class Pessoa {
    private String name;
    private Integer age;
    private Long cpf;

   public Pessoa(String name, Integer age, Long cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
   }

   @Override
   public String toString() {
       String information = String.format("[Nome: %s, Idade %s, CPF: %s]", name, age, cpf);
       return information;
   }

   public Integer getAge() {
       return age;
   }

   public Long getCpf() {
       return cpf;
   }

   public String getName() {
       return name;
   }

}
