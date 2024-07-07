package Collection_Framework_API.OpercacoesBasicas.exer10;

import java.util.ArrayList;
import java.util.Collections;

public class TestConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta(100.00);
        Conta conta2 = new Conta(102.00);
        Conta conta3 = new Conta(333.00);
        Conta conta4 = new Conta(222.00);
        Conta conta5 = new Conta(111.00);
        
        ArrayList<Conta> listConta = new ArrayList<>();

        listConta.add(conta1);
        listConta.add(conta2);
        listConta.add(conta3);
        listConta.add(conta4);
        listConta.add(conta5);


        for(Conta c : listConta){
            System.out.println(c.getSale());
        }
    }
}
