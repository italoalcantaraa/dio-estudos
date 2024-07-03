package arquivoCSV;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ex1
 */
public class ex1 {

    public static void main(String[] args) {

        List<String> lineList;
        File file = new File("C:\\Users\\italo\\OneDrive\\Documentos\\Estudos Java\\in.txt");
        Scanner ler = null;

        try {
            ler = new Scanner(file);
            lineList = new ArrayList<>();
            while (ler.hasNextLine()) {
                lineList.add(ler.nextLine());
            }
            for (int i = 0; i < lineList.size(); i++) {
                System.out.printf("\n{%s},", lineList.get(i));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (ler != null) {
                ler.close();
            }
        }
    }
}