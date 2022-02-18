package Observer;

//Observer design pattern is useful when you are interested in the state of an object
// and want to get notified whenever there is any change.

// In observer pattern, the object that watch on the state of another object are called Observer
// and the object that is being watched is called Subject.

public interface Subject {

    //methods to register and unregister observers
    public void register(Observer obj);
    public void unregister(Observer obj);

    //method to notify observers of change
    public void notifyObservers();

    //method to get updates from subject
    public Object getUpdate(Observer obj);

}
