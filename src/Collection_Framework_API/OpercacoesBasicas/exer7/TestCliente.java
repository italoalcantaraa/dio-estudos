package Collection_Framework_API.OpercacoesBasicas.exer7;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();

        int id, age;
        String name;
        long phone; 

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Informe o id: ");
            id = input.nextInt();

            if(id < 0) {
                break;
            }

            System.out.println("Informe a idade: ");
            age = input.nextInt();

            System.out.println("Informe o nome: ");
            name = input.next();
            
            System.out.println("Informe o número de telefone: ");
            phone = input.nextLong();

            clientes.add(new Cliente(id, name, age, phone));
        }

        input.close();
        System.out.println(clientes);
    }  
}
