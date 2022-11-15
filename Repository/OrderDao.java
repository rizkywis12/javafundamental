package tugasEnamCobaCoba.Repository;



// Import library
import tugasEnamCobaCoba.Model.Order;
import tugasEnamCobaCoba.Services.CrudServices;
import tugasEnamCobaCoba.Services.OrderServices;

import java.text.SimpleDateFormat;

import java.util.*;

public class OrderDao implements OrderServices<Integer> {

    int sum;

    private Order order = new Order();
    private MenuDao menudao = new MenuDao();
    List<Order> listofOrder = new ArrayList<Order>();
    List<Integer> totalOrder = new ArrayList<Integer>();


    @Override
    public int getTotalOrder() {
        sum = 0;
        for (Integer totalOrder : totalOrder) {
            sum += totalOrder;
        }
        totalOrder.clear();
        return sum;
    }


    @Override
    public int getTotalOrderPPN() {
        return (sum + (sum * 11 / 100));
    }


    @Override
    public void payment(Integer amount) {
        System.out.println("\n========== STRUK ==========");
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh.mm.ss aa | dd-MMm-yyyy");
        String formattedDate = dateFormat.format(new Date()).toString();
        System.out.println("\n==== TANGGAL TRANSAKSI =====");
        System.out.println(formattedDate);
        System.out.println("\nBERHASIL BAYAR " + amount);
        System.out.println("\nTengkyu cuy!!!");
        listofOrder.clear();

    }
}
