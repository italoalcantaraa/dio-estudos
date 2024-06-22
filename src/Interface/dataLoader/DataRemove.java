package Interface.dataLoader;

public interface DataRemove {
    void Remove();
    default void CheckPermission() {
        System.out.println("Verificando permissões.");
    };
};
