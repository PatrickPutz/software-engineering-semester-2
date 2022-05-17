package comparablecomparator.bsp3;

import java.util.Comparator;

public class ShareLikeRatioDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        return Double.compare(((double) o2.getShares() / (double) o2.getLikes()), ((double) o1.getShares() / (double) o1.getLikes()) );
    }
}
