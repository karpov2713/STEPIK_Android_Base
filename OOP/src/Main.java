public class Main {

    public static void main(String[] args) {
        // MONSTER
//        Monster monster = new Monster(5);
//        monster.voice(3, "A-a-a-a-a-a-a-a-a-a-a-a-a");

        // MATH
//        System.out.println(MyMath.multiple(10, 5));
//        System.out.println(MyMath.multiple(10.8, 5.2)); // Перегрузка метода multiple
//        System.out.println(MyMath.multiple(25)); // Используются статические методы класса, ему не нужны экземпляры
//
//        System.out.println(Math.sqrt(225)); // Встроенный Класс Math

        // СОТРУДНИКИ
//        Worker worker = new Worker("John", "Director", 100_000);
//        worker.showInfo();

        // ПРЯМОУГОЛЬНИК
//        Rectangle rect = new Rectangle();
//        rect.setDimens(10, 5);
//        System.out.println(rect.getArea());

        // КОРОБКИ
        Box box = new Box(30);
        Box box1 = new Box(); // Использование конструктора
        //box1.setDimens(10, 10, 10);
        Box box2 = new Box(20, 20, 20); // Использование конструктора
        //box2.setDimens(20, 20, 20);
        box.showVolume();
        box1.showVolume();
        box2.showVolume();

        Box currentBox = new Box(10);
        Box anotherBox = new Box(currentBox);
        anotherBox.setDimens(20, 20, 20);
        System.out.println(currentBox.compare(anotherBox));
        currentBox.showVolume();
        anotherBox.showVolume();

        // ЛЮДИ
//        Person john = new Person();
//        john.name = "John";
//        john.age = 27;
//        john.weight = 65;
//
//        Person max = new Person();
//        max.name = "Max";
//        max.age = 20;
//        max.weight = 71;
//
//        Person helen = new Person();
//        helen.name = "Helen";
//        helen.age = 17;
//        helen.weight = 55;
//
//        double sum = john.age + max.age + helen.age;
//        double average = sum / 3;
//        System.out.println(average);

        // СОБАКИ
//        Dog dog1 = new Dog();
//        dog1.name = "Тузик";
//        dog1.breed = "Такса";
//        dog1.weight = 3;
//        dog1.speed = 5;
//        System.out.println(dog1.getInfo());
//        dog1.run();

//        Test test = new Test();
//        System.out.println(test.square(20));

    }
}