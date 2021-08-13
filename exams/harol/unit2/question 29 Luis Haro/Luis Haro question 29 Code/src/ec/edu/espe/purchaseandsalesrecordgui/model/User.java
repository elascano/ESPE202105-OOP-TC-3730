package ec.edu.espe.purchaseandsalesrecordgui.model;

/**
 *
 * @author Andrés López
 */
public class User {


    private String user;
    private String password;
   

    public User() {
        
    }

    public User(String user, String pass) {
        this.user = user;
        this.password = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return password;
    }

    public void setPass(String pass) {
        this.password = pass;
    }

    @Override
    public String toString() {
        return "User{" + "user=" + user + ", pass=" + password + '}';
    }

  
}
