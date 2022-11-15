package tugasEnamCobaCoba.Services;

import java.util.List;

public interface OrderServices<K> {



    int getTotalOrder();

    int getTotalOrderPPN();


    void payment(K amount);
}

