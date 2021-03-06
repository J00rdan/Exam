package Model;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String username;


    public User(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Model.User{" +
                "id=" + id +
                ", username=" + username +
                '}';
    }
}
