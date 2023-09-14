public class Pear{

    public String shape;

    public String getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return "Pear{" +
                "shape='" + shape + '\'' +
                '}';
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Pear(String shape) {
        this.shape = shape;
    }
}
