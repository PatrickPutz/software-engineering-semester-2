package comparablecomparator.bsp2;

import java.util.Comparator;

public class AvgAmountPerItemAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        return Double.compare((o1.getTotalAmount() / (double) o1.getTotalItems()), (o2.getTotalAmount() / (double) o2.getTotalItems()));
    }
}
