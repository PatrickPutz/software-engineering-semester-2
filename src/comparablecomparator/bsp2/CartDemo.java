package comparablecomparator.bsp2;

import java.util.ArrayList;
import java.util.Collections;

public class CartDemo {

    public static void main(String[] args) {

        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(new Cart("Pat", 5, 12, 499.99));
        carts.add(new Cart("Leo", 7, 14, 255.55));
        carts.add(new Cart("Matt", 6, 10, 745.00));

        System.out.println("<<< Initial List >>>");
        for (Cart cart : carts) {
            System.out.println(cart.toString());
        }

        Collections.sort(carts);

        System.out.println("<<< Sorted List >>>");
        for (Cart cart : carts) {
            System.out.println(cart.toString());
        }

        Collections.sort(carts, new CartUserNameComparator());

        System.out.println("<<< Sorted List: Username >>>");
        for (Cart cart : carts) {
            System.out.println(cart.toString());
        }

        Collections.sort(carts, new CartTotalItemsComparator());

        System.out.println("<<< Sorted List: Total Items >>>");
        for (Cart cart : carts) {
            System.out.println(cart.toString());
        }

    }

}
