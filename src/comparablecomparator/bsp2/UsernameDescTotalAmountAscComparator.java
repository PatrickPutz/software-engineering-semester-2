package comparablecomparator.bsp2;

import java.util.Comparator;

public class UsernameDescTotalAmountAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        if(o1.getUsername().equals(o2.getUsername()))
            return Double.compare(o1.getTotalAmount(), o2.getTotalAmount());

        return o2.getUsername().compareTo(o1.getUsername());
    }
}
