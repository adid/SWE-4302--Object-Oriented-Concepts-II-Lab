class Canvas {

    public void addShapeExtend(GenericNode<? extends _2DShape> shapeNode) {
        System.out.println("Adding " + shapeNode.getShape().getName());
    }

    public void addShapeSuper(GenericNode<? super  _2DShape> shapeNode) {
        System.out.println("Adding " + shapeNode.getShape().getName());
    }
}