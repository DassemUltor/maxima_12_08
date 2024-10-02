package lesson_9.task_2;

public class User {

    private String login;
    private String password;
    public Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User - \n " + basket;
    }
}
