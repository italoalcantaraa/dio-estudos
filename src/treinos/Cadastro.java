package treinos;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        String email, senha;
        boolean validaLogin = true;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe seu e-mail: ");
        email = ler.next();

        System.out.println("Informe a senha: ");
        senha = ler.next();

        Usuario user1 = new Usuario(email, senha);

        System.out.println("S = Sim\nCaso não queira, digite qualquer tecla");
        System.out.println("Desja fazer login? ");
        char logar = ler.next().charAt(0);

        if (logar == 's' || logar == 'S') {
            while (validaLogin) {
                System.out.println("Informe o e-mail: ");
                email = ler.next();

                System.out.println("Informe a senha: ");
                senha = ler.next();
                if((validaLogin = email.intern() == user1.getEmail().intern() && senha.intern() == user1.getSenha().intern() ? false : true) == true)
                    System.out.println("Usuário ou senha inválidos!\n");                
            }
            System.out.println("Logado!");
        }
        System.out.println("Obrigado por participar!");
    }
}
