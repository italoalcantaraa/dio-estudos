package Interface.dataLoader;

public class DatabaseLoader implements DataLoader, DataRemove{
     public void loader() {
        System.out.println("Carregando dados do banco de dados.");
     } 
     public void Remove() {
        System.out.println("Removendo dados do banco de dados.");
     }
}
