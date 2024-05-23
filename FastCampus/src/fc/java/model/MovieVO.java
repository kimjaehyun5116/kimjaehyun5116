package fc.java.model;

public class MovieVO {
    private String title;
    private String day;
    private String major;
    private String part;
    private int time;
    private String level;

    // 디폴트 생성자
    public MovieVO() {
    }

    public MovieVO(String title, String day, String major, String part, int time, String level) {
        this.title = title;
        this.day = day;
        this.major = major;
        this.part = part;
        this.time = time;
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", day='" + day + '\'' +
                ", major='" + major + '\'' +
                ", part='" + part + '\'' +
                ", time=" + time +
                ", level='" + level + '\'' +
                '}';
    }
}
