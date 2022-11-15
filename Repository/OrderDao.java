//package tugasEnamCobaCoba.Repository;
//
//
//
//// Import library
//import tugasEnamCobaCoba.Model.Order;
//import tugasEnamCobaCoba.Services.OrderService;
//
//import java.text.SimpleDateFormat;
//
//import java.util.*;
//
//public class OrderDao implements OrderService<Order,Integer> {
//
//    List<Order> listOfOrder = new ArrayList<>();
//
//
//    @Override
//    public void payment(int amount) {
//        System.out.println("\n========== STRUK ==========");
//        SimpleDateFormat dateFormat = new SimpleDateFormat("hh.mm.ss aa | dd-MMm-yyyy");
//        String formattedDate = dateFormat.format(new Date()).toString();
//        System.out.println("\n==== TANGGAL TRANSAKSI =====");
//        System.out.println(formattedDate);
//        System.out.println("\nBERHASIL BAYAR " + amount);
//        System.out.println("\nTengkyu cuy!!!");
//        listOfOrder.clear();
//    }
//}
