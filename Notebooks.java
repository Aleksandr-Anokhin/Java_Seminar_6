
public class Notebooks {
    private String brandName;
    private String RAM;
    private String hardDisk;
    private String OS;
    private String colour;
    
    public Notebooks(String brandName, String RAM, String hardDisk, String OS, String colour) {
        this.brandName = brandName;
        this.RAM = RAM;
        this.hardDisk = hardDisk;
        this.OS = OS;
        this.colour = colour;
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

    @Override
    public String toString() {
        return "Notebooks [name = " + brandName + ", ram = " + RAM + ", hardDisk = " + hardDisk + ", operatingSystem = "
                + OS + ", colour = " + colour + "]";
    }
}