public class Loop {

    public static void main(String[] args) {
        int i = 1;

        while (i <= 1000) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        while (i <= 1000) {
            System.out.println(i);
            i++;
            if(i == 5){
                break;
            }
        }

        int a = 0;
        do {
            System.out.println("Hello!");
        } while (a > 0);

        for (int s = 1; s <= 1000; s++) {
            System.out.println(s);
        }

        for (int j = 1000; j >= 0 ; j--) {
            if(j % 3 == 0){
                System.out.println(j);
            }
        }
    }
}
