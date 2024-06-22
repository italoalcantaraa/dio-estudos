package Interface.dataLoader;

public class FileLoader implements DataLoader, DataRemove{
        public void loader() {
            System.out.println("Carregando dados de arquivos.");
        }

        public void Remove() {
            System.out.println("Removendo dados de arquivos.");
        }
}
