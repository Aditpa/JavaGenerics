public class Apple{

    private String appleColor;
    private boolean isEaten;


    public Apple(String appleColor, boolean isEaten) {
        this.appleColor = appleColor;
        this.isEaten = isEaten;
    }

    public void setEaten(boolean eaten) {
        isEaten = eaten;
    }

    public String getAppleColor() {
        return appleColor;
    }

    @Override
    public String toString() {
        return "Apple Color= "+ appleColor+"Is eaten?= "+isEaten;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

}
