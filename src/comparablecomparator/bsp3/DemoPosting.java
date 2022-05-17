package comparablecomparator.bsp3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class DemoPosting {

    public static void main(String[] args) {

        Posting p1 = new Posting(1, "Pat", "God", LocalDateTime.of(2022,3,10,18,30,15), 1_000, 999, 50_000);
        Posting p2 = new Posting(200, "Leo", "Weeb", LocalDateTime.of(2022,7,11,19,32,12), 0, 0, 3);
        Posting p3 = new Posting(50, "Matt", "Tomato", LocalDateTime.of(2022,1,13,18,10,12), 1_000, 998, 50);
        Posting p4 = new Posting(21, "Simon", "Scrum", LocalDateTime.of(2022,3,11,11,3,8), 100, 99, 50);
        Posting p5 = new Posting(77, "Klaus", "Dev", LocalDateTime.of(2022,12,15,1,8,55), 200, 50, 50);
        Posting p6 = new Posting(12, "Daniel", "Game", LocalDateTime.of(2022,8,20,1,5,41), 23, 15, 76);
        Posting p7 = new Posting(265, "Lisa", "Art", LocalDateTime.of(2022,1,30,8,25,17), 1_000, 0, 6_000);
        Posting p8 = new Posting(300, "Marie", "Nurse", LocalDateTime.of(2022,5,18,7,7,23), 200, 500, 1_000);
        Posting p9 = new Posting(800, "Gunther", "Chef", LocalDateTime.of(2022,2,1,5,1,10), 100, 5, 400);
        Posting p10 = new Posting(17, "Olaf", "Viking", LocalDateTime.of(2022,1,3,17,9,1), 23, 15, 30);

        ArrayList<Posting> postings = new ArrayList<>();
        postings.add(p1);
        postings.add(p2);
        postings.add(p3);
        postings.add(p4);
        postings.add(p5);
        postings.add(p6);
        postings.add(p7);
        postings.add(p8);
        postings.add(p9);
        postings.add(p10);

        System.out.println("");
        System.out.println("<<< Initial List >>>");
        for (Posting posting : postings) {
            System.out.println(posting);
        }

        Collections.sort(postings);
        System.out.println("");
        System.out.println("<<< Sorted List: IdAscComparable >>>");
        for (Posting posting : postings) {
            System.out.println(posting);
        }

        Collections.sort(postings, new RealnameAscComparator());
        System.out.println("");
        System.out.println("<<< Sorted List: RealnameAscComparator >>>");
        for (Posting posting : postings) {
            System.out.println(posting);
        }

        Collections.sort(postings, new DateTimeDescComparator());
        System.out.println("");
        System.out.println("<<< Sorted List: DateTimeDescComparator >>>");
        for (Posting posting : postings) {
            System.out.println(posting);
        }

        Collections.sort(postings, new LikesDescSharesDescComparator());
        System.out.println("");
        System.out.println("<<< Sorted List: LikesDescSharesDescComparator >>>");
        for (Posting posting : postings) {
            System.out.println(posting);
        }

        Collections.sort(postings, new ViewsDescSharesDescComparator());
        System.out.println("");
        System.out.println("<<< Sorted List: ViewsDescSharesDescComparator >>>");
        for (Posting posting : postings) {
            System.out.println(posting);
        }

        Collections.sort(postings, new LikesPerViewAscComparator());
        System.out.println("");
        System.out.println("<<< Sorted List: LikesPerViewAscComparator >>>");
        for (Posting posting : postings) {
            System.out.println(posting);
        }

        Collections.sort(postings, new ShareLikeRatioDescComparator());
        System.out.println("");
        System.out.println("<<< Sorted List: ShareLikeRatioDescComparator >>>");
        for (Posting posting : postings) {
            System.out.println(posting);
        }
    }

}
