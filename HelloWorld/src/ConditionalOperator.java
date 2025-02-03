public class ConditionalOperator {
    public static void main(String[] args) {

        int temp = 29;
        if (temp > 25){
            System.out.println("Кондиционер включен");
        } else if (temp < 22){
            System.out.println("Кондиционер выключен");
        } else {
            System.out.println("Кондиционер ничего не делает");
        }
    }
}
