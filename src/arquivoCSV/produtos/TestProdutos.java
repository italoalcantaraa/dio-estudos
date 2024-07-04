package arquivoCSV.produtos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestProdutos {
    public static void main(String[] args) {
        List<Produto> product = new ArrayList<>();
        String path = "C:\\Users\\italo\\OneDrive\\Documentos\\Estudos Java\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String values = br.readLine();
            // Verifica se tem ao menos um produto
            values = br.readLine();

            while (values != null) {
                String[] productValues = values.split(";");
                values = br.readLine();
                String name = productValues[0];
                Double price = Double.parseDouble(productValues[1]);
                Integer quantity = Integer.parseInt(productValues[2]);

                product.add(new Produto(name, price, quantity));
            }

            System.out.println(product);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
