public class Box {
    double length;
    double width;
    double height;

    Box() {
        this(10);
    }

    Box(Box another){
        this(another.length, another.width, another.height);
    }

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(int size) {
        this(size, size, size);
    }

    void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        if (currentVolume > anotherVolume) {
            return 1;
        } else if (currentVolume < anotherVolume) {
            return -1;
        } else {
            return 0;
        }
    }

    double getVolume() {
        return length * width * height;
    }

    void showVolume() {
        // double volume = length * width * height;
        System.out.println(getVolume());
    }
}
