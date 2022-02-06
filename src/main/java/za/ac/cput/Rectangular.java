package za.ac.cput;
// Student Name - Shina Kara
//Student Number - 219333181
public class Rectangular {

    private double length, width, height;
    private double lxhSurf;
    private double lxwSurf;
    private double hxwSurf;
    private double volume;
    private double surface;

    public Rectangular() {
        length = 0;
        width = 0;
        height = 0;
    }

    public Rectangular(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateSurface() {
        lxhSurf = 2 * (this.length * this.height);
        lxwSurf = 2 * (this.length * this.width);
        hxwSurf = 2 * (this.height * this.width);

        surface = lxhSurf + lxwSurf + hxwSurf;
        return this.surface;
    }

    public double calculateVolume() {
        volume = this.length * this.width * this.height;
        return this.volume;
    }

    public String displayResults() {
        return ("*******************************************\n"
                + "the values you have entered are: \n\n"
                + "length = " + this.length + "\n"
                + "height = " + this.height + "\n"
                + "width = " + this.width + "\n");
    }}