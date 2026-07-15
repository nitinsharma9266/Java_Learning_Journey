package OOPs.Constructor;

public class ThisKeywordWithoutThis {
    String brand;
    ThisKeywordWithoutThis(String brand) {
       // brand = brand;

    }
    void display() {
        System.out.println("Brand : " + brand);
    }
    public static void main(String[] args) {

        ThisKeywordWithoutThis c = new ThisKeywordWithoutThis("BMW");

        c.display();
    }
}