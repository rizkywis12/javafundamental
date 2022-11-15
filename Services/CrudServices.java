package tugasEnamCobaCoba.Services;


import tugasEnamCobaCoba.Model.Menu;

// Import library
import java.util.*;

public interface CrudServices<T, K> {

    // CRUD method
    List<T> findAll();
    T findById (K id);
    void save (Menu data);
    void update (K id, T data);
    void delete (K id);
    int getMenu(int index);
    void updatePesanan (K id, K data);
}
