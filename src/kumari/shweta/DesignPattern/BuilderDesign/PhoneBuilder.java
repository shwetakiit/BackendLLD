/*package kumari.shweta.DesignPattern.BuilderDesign;

public class PhoneBuilder {


    private String os;
    private int osVersion;
    private String brand;
    private String model;
    private String battery;
    private String camera;
    private String processor;



    public String getOs() {
        return os;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public String getProcessor() {
        return processor;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public String getCamera() {
        return camera;
    }

    public PhoneBuilder setCamera(String camera) {
        this.camera = camera;
        return this;
    }

    public String getBattery() {
        return battery;
    }

    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public String getModel() {
        return model;
    }

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public PhoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public int getOsVersion() {
        return osVersion;
    }

    public PhoneBuilder setOsVersion(int osVersion) {
        this.osVersion = osVersion;
        return this;
    }

   public Phone build(){
        //If we have to do validation without creating Phone object .
        if(osVersion<8){
            throw new IllegalArgumentException("OS version should be at least 8");
        }

        return new Phone(this); //To avoid the access issue of Private constructor of Phone in Builder class . Create this builder class in Phone class  as inner class.

    }
}*/
