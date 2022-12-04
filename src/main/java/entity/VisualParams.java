package entity;

public class VisualParams {
    private String colorOfColor;
    private String leafColorOfFlower;
    private String sizeOfColor;

    @Override
    public String toString() {
        return "VisualParams{" +
                "color = '" + colorOfColor + '\t' +
                ", leafColor = '" + leafColorOfFlower + '\t' +
                ", size = '" + sizeOfColor + '\t' +
                '}';
    }

    public void setColorOfColor(String colorOfColor) {
        this.colorOfColor = colorOfColor;
    }

    public void setLeafColorOfFlower(String leafColorOfFlower) {
        this.leafColorOfFlower = leafColorOfFlower;
    }

    public void setSizeOfColor(String sizeOfColor) {
        this.sizeOfColor = sizeOfColor;
    }

    public VisualParams() {
    }
}