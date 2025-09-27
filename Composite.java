interface Component {
    void display();
}

class Leaf implements Component {
    private String name;
    Leaf(String name) { this.name = name; }
    public void display() { System.out.println("Leaf: " + name); }
}

class Composite implements Component {
    private java.util.ArrayList<Component> children = new java.util.ArrayList<>();
    private String name;
    Composite(String name) { this.name = name; }
    public void add(Component c) { children.add(c); }
    public void display() {
        System.out.println("Composite: " + name);
        for (Component c : children) c.display();
    }
}

public class CompositeExample {
    public static void main(String[] args) {
        Composite root = new Composite("Root");
        root.add(new Leaf("Leaf1"));
        Composite branch = new Composite("Branch");
        branch.add(new Leaf("Leaf2"));
        root.add(branch);
        root.display();
    }
}