package comparablecomparator.bsp3;

import java.time.LocalDateTime;
import java.util.Objects;

public class Posting implements Comparable<Posting>{

    private int id;
    private String realname;
    private String screenname;
    private LocalDateTime dateTime;
    private int likes;
    private int shares;
    private int views;

    public Posting(int id, String realname, String screenname, LocalDateTime dateTime, int likes, int shares, int views) {
        this.id = id;
        this.realname = realname;
        this.screenname = screenname;
        this.dateTime = dateTime;
        this.likes = likes;
        this.shares = shares;
        this.views = views;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posting posting = (Posting) o;
        return id == posting.id && likes == posting.likes && shares == posting.shares && views == posting.views && Objects.equals(realname, posting.realname) && Objects.equals(screenname, posting.screenname) && Objects.equals(dateTime, posting.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, realname, screenname, dateTime, likes, shares, views);
    }

    @Override
    public String toString() {
        return "Posting{" +
                "id=" + id +
                ", realname='" + realname + '\'' +
                ", screenname='" + screenname + '\'' +
                ", dateTime=" + dateTime +
                ", likes=" + likes +
                ", shares=" + shares +
                ", views=" + views +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getRealname() {
        return realname;
    }

    public String getScreenname() {
        return screenname;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getLikes() {
        return likes;
    }

    public int getShares() {
        return shares;
    }

    public int getViews() {
        return views;
    }

    @Override
    public int compareTo(Posting o) {
        return Integer.compare(this.getId(), o.getId());
    }
}
