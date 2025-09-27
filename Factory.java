interface Product {
    void display();
}

class ConcreteProduct1 implements Product {
    public void display() { System.out.println("Product 1"); }
}

class ConcreteProduct2 implements Product {
    public void display() { System.out.println("Product 2"); }
}

class Factory {
    public static Product createProduct(String type) {
        if ("1".equals(type)) return new ConcreteProduct1();
        if ("2".equals(type)) return new ConcreteProduct2();
        throw new IllegalArgumentException("Unknown type");
    }
}

public class FactoryExample {
    public static void main(String[] args) {
        Product p1 = Factory.createProduct("1");
        Product p2 = Factory.createProduct("2");
        p1.display();
        p2.display();
    }
}