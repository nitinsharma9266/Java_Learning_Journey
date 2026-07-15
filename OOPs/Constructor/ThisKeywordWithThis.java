package OOPs.Constructor;

public class ThisKeywordWithThis {

    String brand;

    ThisKeywordWithThis(String brand) {

        this.brand = brand;

    }

    void display() {

        System.out.println("Brand : " + brand);

    }

    public static void main(String[] args) {

        ThisKeywordWithThis c = new ThisKeywordWithThis("BMW");

        c.display();
    }
}