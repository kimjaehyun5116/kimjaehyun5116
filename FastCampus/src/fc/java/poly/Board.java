package fc.java.poly;

public class Board extends Object{ // toString()
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    // Override (재정의)
    @Override
    public String toString() {
        // System.out.println(super.toString()); // 상위클래스의 메서드 호출(부모의)
        return title;
    }
}
