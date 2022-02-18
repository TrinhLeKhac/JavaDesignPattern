package Mediator;

// Mediator design pattern is very helpful in an enterprise application where multiple objects are interacting with each other

// Mediator pattern interface
public interface ChatMediator {

    public void sendMessage(String msg, User user);

    void addUser(User user);
}
