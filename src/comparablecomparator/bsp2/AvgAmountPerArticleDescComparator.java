package comparablecomparator.bsp2;

import java.util.Comparator;

public class AvgAmountPerArticleDescComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        return Double.compare((o2.getTotalAmount() / (double) o2.getNumArticles()), (o1.getTotalAmount() / (double) o1.getNumArticles()));
    }
}
