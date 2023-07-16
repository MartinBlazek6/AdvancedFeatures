package geometry;

import java.awt.*;

public class Shape {
    String color;
    boolean isFilled;

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String filledReporter() {
        return isFilled ? "filled" : "NotFilled";
    }


    @Override
    public String toString() {
       return "geometry.Shape with color of "+color+" and " + filledReporter();
    }
}
