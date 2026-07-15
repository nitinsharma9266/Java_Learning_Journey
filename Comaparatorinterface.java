import java.util.TreeSet;

class Product implements Comparable<Product> {
    int pcode;
    String name;
    int price;

    Product(int pcode, String name, int price) {
        this.pcode = pcode;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return pcode + " : " + name + " : " + price;
    }

    public int compareTo(Product p) {
        if (this.price > p.price)
            return 1;
        else if (this.price == p.price)
            return 0;
        else
            return -1;
    }
}

public class Comaparatorinterface {
    public static void main(String[] args) {
        TreeSet<Product> lst = new TreeSet<>();

        lst.add(new Product(12, "computer", 35000));
        lst.add(new Product(2, "HDD", 2000));
        lst.add(new Product(45, "RAM", 1500));
        lst.add(new Product(64, "Keyboard", 200));
        lst.add(new Product(26, "Mouse", 150));
        lst.add(new Product(673, "Monitor", 3500));
        lst.add(new Product(22, "Motherboard", 6000));
        lst.add(new Product(53, "CPU", 6500));
        lst.add(new Product(232, "SSD", 1504));
        lst.add(new Product(31, "Printer", 12000));

        for (Product p : lst) {
            System.out.println(p);
        }
    }
}