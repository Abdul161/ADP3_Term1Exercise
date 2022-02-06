package za.ac.cput;

public class Prisms {
    private String volume, surface;

    public Prisms() {
        this.volume = "base * height";
        this.surface = "2B + PH";
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "Prisms:\n" + "volume=" + volume + ", surface=" + surface + "";
    }
}
