package les6;

public class Notebook {
    private int ram;
    private int hard;
    private String os;
    private String color;
    private String brand;

    @Override
    public String toString() {
        return "Notebook{" +
                "ram=" + ram +
                ", hard=" + hard +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public Notebook(int ram, int hard, String os, String color, String brand) {
        this.ram = ram;
        this.hard = hard;
        this.os = os;
        this.color = color;
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHard() {
        return hard;
    }

    public void setHard(int hard) {
        this.hard = hard;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
