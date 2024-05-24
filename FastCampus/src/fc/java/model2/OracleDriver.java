package fc.java.model2;
// OracleDriver 는 Oracle 회사에서 만들어서 제공하면된다. (Driver)
public class OracleDriver implements Connection {
    @Override
    public void getConnection(String url, String username, String password) {
        // 실제적으로 구현이 되어있다....
        System.out.println("url, username, password 정보를 이용하여 oracle DB를 접속 시도한다.");
    }
}
