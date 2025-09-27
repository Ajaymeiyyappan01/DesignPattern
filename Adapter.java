interface Target {
    void request();
}

class Adaptee {
    public void specificRequest() { System.out.println("Adaptee method."); }
}

class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();
    public void request() { adaptee.specificRequest(); }
}

public class AdapterExample {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}