package fc.java.poly;

public class TV implements RemoCon {
    @Override
    public void chUp() {
        System.out.println("TV의 채널이 올라간다");
    }

    @Override
    public void chDown() {
        System.out.println("TV의 채널이 내려간다");
    }

    @Override
    public void volUp() {
        System.out.println("TV의 소리가 올라간다");
    }

    @Override
    public void volDown() {
        System.out.println("TV의 소리가 내려간다");
    }

    @Override
    public void internet() {
        System.out.println("TV의 인터넷이 구동되었습니다");
    }
    // chUp(), chDown(), volUp(), volDown()
}
