package Function;

public class CallByValue {
    public static void change(int x)
    {
        x = x * 2;
    }

    public static void main(String[] args)
    {
        int a = 25;

        change(a);

        System.out.println(a);
    }
}
