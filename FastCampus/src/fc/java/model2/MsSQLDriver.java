package fc.java.model2;

public class MsSQLDriver implements Connection {
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password 정보를 이용하여 MsSQLDriver DB를 접속 시도한다.");
    }
}
