package OOPs.Constructor;

public class ThisKeywordDemo {

    String name;
    int age;

    ThisKeywordDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {

        ThisKeywordDemo s1 = new ThisKeywordDemo("Nitin", 20);

        s1.display();
    }
}

