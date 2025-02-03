public class Box {
    double length;
    double width;
    double height;

    void setDimens(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getVolume(){
        return length * width * height;
    }

    void showVolume(){
        // double volume = length * width * height;
        System.out.println(getVolume());
    }


}
