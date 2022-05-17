package comparablecomparator.bsp3;

import java.util.Comparator;

public class ViewsDescSharesDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        if(o1.getViews() == o2.getViews())
            return Integer.compare(o2.getShares(), o1.getShares());

        return Integer.compare(o2.getViews(), o1.getViews());
    }
}
