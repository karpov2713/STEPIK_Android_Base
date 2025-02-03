public class IntegerTypes {
    public static void main(String[] args) {

        int speed = 300_000;
        long distance = 365L * 24 * 60 * 60 * speed;
//        System.out.println(distance);

        int a = 5;
        a++;
        System.out.println(a);
        a += 10;
        System.out.println(a);
        a -= 6;
        System.out.println(a);
        a--;
        System.out.println(a);

        byte b = 127;
        b++;
        System.out.println(b);
        b++;
        System.out.println(b);

        byte c = 10;
        c = (byte) (c + 10);
        System.out.println(c);

        byte e = 10;
        int f = e + 10;
        System.out.println(f);
    }
}
