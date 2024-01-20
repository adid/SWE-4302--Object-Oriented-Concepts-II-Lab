public class Program {
    public static void main(String[] args) {


        GenericNode<Circle> circleNode = new GenericNode<>();
        GenericNode<Rectangle> rectangleNode = new GenericNode<>();
        GenericNode<Cube> cubeNode = new GenericNode<>();
        //GenericNode<String> stringNode = new GenericNode<>();     //Not valid because String doesn't inherit Shape
        //GenericNode<Integer> integerNode = new GenericNode<>();   //Not valid because Integer doesn't inherit Shape

        Canvas canvas= new Canvas();

        // canvas.addShapeExtend(cubeNode);     //Can't be done due to not inheriting 3D
        canvas.addShapeExtend(circleNode);
    }
}