import java.util.*;

// Simple class for Box info
class Box {
    double height;
    double width;
    double breadth;
    //    Constructor when no arguments are passed
    Box() {
        height = -1;
        width = -1;
        breadth = -1;
        System.out.println("Empty params!");
    }

    //    Constructor when height, width & breadth are passed
    Box(float Height, float Width, float Breadth) {
        height = Height;
        width = Width;
        breadth = Breadth;
    }

    //      To compute the volume
    double Volume() {
        double volume = height * width * breadth;
//        System.out.println("The volume of the box is: " + volume);
        return volume;
    }
}
//    Same box with another extra parameter called weight
    class BoxWeight extends Box{
        double weight;
        BoxWeight(float Height, float Width, float Breadth, float Weight){
            super(Height, Width, Breadth);
            weight = Weight;
        }
}
//      Main class
    class Demo{
    public static void main(String args[]){
        Box box1 = new Box();
        Box box2 = new Box(10, 10, 10);
        BoxWeight box3 = new BoxWeight(10, 12, 13, 15);
        double vol1;
        double vol2;
        vol1 = box2.Volume();
        System.out.println("The volume of the first box is: " + vol1);

        vol2 = box3.Volume();
        System.out.println("The volume of the second box is :" + vol2);
        System.out.println("The weight of the box is: " + box3.weight);
    }
}
