package kumari.shweta.DesignPattern.creationaldesign.BuilderDesign;

public class Phone {
    private String os;
    private String osVersion;
    private String brand;
    private String model;
    private String battery;
    private String camera;
    private String processor;


 /*   public  Phone(PhoneBuilder phoneBuilder) {
      if(phoneBuilder.getOsVersion()<8){
          throw  new IllegalArgumentException("OS version should be at least 8");
      }

      this.os=phoneBuilder.getOs();
      this.brand=phoneBuilder.getBrand();
      this.model=phoneBuilder.getModel();
      this.battery=phoneBuilder.getBattery();
      this.processor= phoneBuilder.getProcessor();
    }*/


    private   Phone(PhoneBuilder phoneBuilder) {
        this.os=phoneBuilder.getOs();
        this.brand=phoneBuilder.getBrand();
        this.model=phoneBuilder.getModel();
        this.battery=phoneBuilder.getBattery();
        this.processor= phoneBuilder.getProcessor();
    }

    //Who is going to stop to create object of Phone without using phoneBuilder so marked this class as private .


    //No getter setter so then we can't directly set value in Phone without validation .If we have validation in Builder class

    //Static method because client need to call this method for creating Object of Builder class  before creating object of Phone
     public static PhoneBuilder getBuilder(){
        return new PhoneBuilder();
     }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", osVersion='" + osVersion + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", camera='" + camera + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }


    static class PhoneBuilder{

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

            return new Phone(this); //To avoid the access issue of Phone in Builder class . Create this builder class in Phone class  as inner class.

        }

    }
}
