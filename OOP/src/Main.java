public class Main {

    public static void main(String[] args) {
//        Box box1 = new Box();
//        box1.height = 10;
//        box1.length = 10;
//        box1.width = 10;
//
//        Box box2 = new Box();
//        box2.height = 20;
//        box2.length = 20;
//        box2.width = 20;
//
//        Box box3 = box2; //  Это не новый объект, а ссылка на уже существующий box2
//        box3.width = 0;
//
//        double volume = box1.height * box1.length * box1.width;
//        System.out.println(volume);
//        double volume2 = box2.height * box2.length * box2.width;
//        System.out.println(volume2);

        Person john = new Person();
        john.name = "John";
        john.age = 27;
        john.weight = 65;

        Person max = new Person();
        max.name = "Max";
        max.age = 20;
        max.weight = 71;

        Person helen = new Person();
        helen.name = "Helen";
        helen.age = 17;
        helen.weight = 55;

        double sum = john.age + max.age + helen.age;
        double average = sum / 3;
        System.out.println(average);


    }

}