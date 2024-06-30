package Collection_Framework_API.OpercacoesBasicas.exer5;

public class testOrdenacaoNumeros {
    public static void main(String[] args) {
        OrdenacaoNumeros num = new OrdenacaoNumeros();
        num.adicionarNumero(1);
        num.adicionarNumero(3);
        num.adicionarNumero(2);
        num.adicionarNumero(4);

        num.ordenarAscendente();
        System.out.println(num);

        num.ordenarDescendente();
        System.out.println(num);

    }
}
