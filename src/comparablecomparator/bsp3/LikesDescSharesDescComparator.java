package comparablecomparator.bsp3;

import java.util.Comparator;

public class LikesDescSharesDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        if(o1.getLikes() == o2.getLikes())
            return Integer.compare(o2.getShares(), o1.getShares());

        return Integer.compare(o2.getLikes(), o1.getLikes());
    }
}
