public class Box {
    double length;
    double width;
    double height;

    double getVolume(){
        return length * width * height;
    }

    void showVolume(){
        // double volume = length * width * height;
        System.out.println(getVolume());
    }
}
