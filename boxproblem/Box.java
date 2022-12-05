package boxproblem;

public class Box {
    Box(double length, double breadth, double height){
        double surfaceArea = 2*(length*breadth + length*height + breadth*height);
        System.out.println(surfaceArea);
    }

    public Box() {

    }
}
