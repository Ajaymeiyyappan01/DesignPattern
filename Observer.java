class Subject {
    private java.util.ArrayList<Observer> observers = new java.util.ArrayList<>();
    private int state;

    public void addObserver(Observer o) { observers.add(o); }
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
    private void notifyObservers() {
        for (Observer o : observers) o.update(state);
    }
}

interface Observer {
    void update(int state);
}

class ConcreteObserver implements Observer {
    private String name;
    ConcreteObserver(String name) { this.name = name; }
    public void update(int state) {
        System.out.println(name + " received update: " + state);
    }
}

public class ObserverExample {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new ConcreteObserver("Observer1"));
        subject.addObserver(new ConcreteObserver("Observer2"));
        subject.setState(10);
    }
}