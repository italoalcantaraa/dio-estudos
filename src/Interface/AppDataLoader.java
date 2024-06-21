package Interface;

import Interface.dataLoader.DataLoader;
import Interface.dataLoader.DatabaseLoader;

public class AppDataLoader {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        databaseLoader.load();
    }
}
