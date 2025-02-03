public class Main {

    public static void main(String[] args) {

        // КОРОБКИ
        Box box1 = new Box();
        box1.height = 10;
        box1.length = 10;
        box1.width = 10;

        Box box2 = new Box();
        box2.height = 20;
        box2.length = 20;
        box2.width = 20;

        box1.showVolume();
        box2.showVolume();

        // ЛЮДИ
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


        // СОБАКИ
        Dog dog1 = new Dog();
        dog1.name = "Тузик";
        dog1.breed = "Такса";
        dog1.weight = 3;
        dog1.speed = 5;
        System.out.println(dog1.getInfo());
        dog1.run();
    }
}