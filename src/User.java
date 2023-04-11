import java.util.Date;
import java.util.Objects;

public class User {
//    private Integer uno;
    private String username;
    private String pw;
//    private Date regDate;
//    private Date upDate;


    public User(){};
    public User(String username, String pw) {
        this.username = username;
        this.pw = pw;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
