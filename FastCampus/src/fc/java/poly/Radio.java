package fc.java.poly;

public class Radio implements RemoCon {
    @Override
    public void chUp() {
        System.out.println("Radio의 채널이 올라간다");
    }

    @Override
    public void chDown() {
        System.out.println("Radio의 채널이 내려간다");
    }

    @Override
    public void volUp() {
        System.out.println("Radio의 소리가 올라간다");
    }

    @Override
    public void volDown() {
        System.out.println("Radio의 소리가 내려간다");
    }

    @Override
    public void internet() {
        System.out.println("Radio 에서는 인터넷 구동되지 않습니다");
    }
    // chUp(), chDown(), volUp(), volDown()
}
