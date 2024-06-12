
/*SISTEMA DE PLANO TELEFÔNICO 
 * BASIC =   100 MIN DE LIGAÇÃO
 * MIDIA = 100 MIN  DE LIGAÇÃO + WHATS E INTAGRAM GRATIS
 * TURBO = 100 MIN DE LIGAÇÃO + WHATS  E INSTAGRAM GRÁTIS + 5GB YOUTUBE
*/

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        char tipoPlano = ' ';

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o plano: ");
        tipoPlano = ler.next().charAt(0);

        switch (tipoPlano) {
            case 'B': {
                System.out.println("BASIC = 100 MIN DE LIGAÇÃO");
                break;
            }
            case 'M': {
                System.out.println("MIDIA = 100 MIN  DE LIGAÇÃO + WHATS E INTAGRAM GRATIS");
                break;
            }
            case 'T': {
                System.out.println("TURBO = 100 MIN DE LIGAÇÃO + WHATS  E INSTAGRAM GRÁTIS + 5GB YOUTUBE");
                break;
            }
            default:
                System.out.println("Opção inválida");
        }
    }
}