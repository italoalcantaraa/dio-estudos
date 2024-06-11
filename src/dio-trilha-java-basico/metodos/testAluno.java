package metodos;

import java.util.Scanner;

public class testAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        Scanner ler  = new Scanner(System.in);
        
        System.out.println("Informe o nome: ");
        aluno1.nome = ler.next();
        
        System.out.println("Informe o a idade: ");
        aluno1.idade = ler.nextByte();

        aluno1.imprimir();
        
    }
}
