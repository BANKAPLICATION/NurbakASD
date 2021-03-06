package sample;

import java.io.Serializable;

public class Employee implements Serializable  {
    private int id;
    private String login;
    private String password;

    public Employee(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public Employee(String login, String password) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "EmployeeController{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


