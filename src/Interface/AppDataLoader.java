package Interface;

import Interface.dataLoader.DatabaseLoader;
import Interface.dataLoader.FileLoader;

public class AppDataLoader {
    public static void main(String[] args) {
        FileLoader fileLoader = new FileLoader();
        DatabaseLoader databaseLoader = new DatabaseLoader();

        fileLoader.loader();
        databaseLoader.loader();

        fileLoader.Remove();
        databaseLoader.Remove();

        fileLoader.CheckPermission();
        databaseLoader.CheckPermission();
    }
}