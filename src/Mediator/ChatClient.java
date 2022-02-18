package Mediator;

public class ChatClient {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "trinhlk2");
        User user2 = new UserImpl(mediator, "yippie");
        User user3 = new UserImpl(mediator, "truong");
        User user4 = new UserImpl(mediator, "turtle");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}
