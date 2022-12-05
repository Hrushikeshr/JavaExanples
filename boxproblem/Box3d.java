package boxproblem;

public class Box3d extends Box {
    Box3d(double length, double breadth, double height){
        super();
        double surfaceArea = 2*(length*breadth + length*height + breadth*height);
        System.out.println(surfaceArea);


    }
}
