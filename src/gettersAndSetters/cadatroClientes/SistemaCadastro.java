package gettersAndSetters.cadatroClientes;

import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = ler.next();

        System.out.println("Informe o cpf: ");
        long cpf = ler.nextLong();
        
        System.out.println("Informe o endereço: ");
        String endereco = ler.next();

        Cliente cliente1 = new Cliente(nome, cpf);
        cliente1.setClienteEndereco(endereco);

        System.out.println("------------");
        System.out.println("Nome: " + cliente1.getClienteNome() + "\ncpf: " + cliente1.getClienteCpf() + "\nEndereço: " + cliente1.getClienteEndereco());
        System.out.println("------------");
    }
}
