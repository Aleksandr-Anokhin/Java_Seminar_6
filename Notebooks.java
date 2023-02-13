
public class Notebooks {
    private String brandName;
    private String RAM;
    private String hardDisk;
    private String OS;
    private String colour;
    private String Price;
    
    public Notebooks(String brandName, String RAM, String hardDisk, String OS, String colour, String Price) {
        this.brandName = brandName;
        this.RAM = RAM;
        this.hardDisk = hardDisk;
        this.OS = OS;
        this.colour = colour;
        this.Price = Price;
    }

    public String getName() {
        return brandName;
    }

    public String getRam() {
        return RAM;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    
    public String getOperatingSystem() {
        return OS;
    }

    
    public String getColour() {
        return colour;
    }

    public String getPrice() {
        return Price;
    }

    @Override
    public String toString() {
        return "Notebooks [name = " + brandName + ", ram = " + RAM + ", hardDisk = " + hardDisk + ", operatingSystem = "
                + OS + ", colour = " + colour + ", Price = " + Price + "]";
    }

    public static Object asList(Notebooks notebook1, Notebooks notebook2, Notebooks notebook3, Notebooks notebook4) {
        return null;
    }
}