class GenericNode<T extends Shape> {
    private T shape;

    public T getShape() {
        return shape;
    }

    public void setShape(T shape) {
        this.shape = shape;
    }
}