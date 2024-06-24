package kumari.shweta.DesignPattern.BuilderDesign;

import java.net.StandardSocketOptions;

public class Client {

    public static void main(String[] args) {

       // PhoneBuilder  phoneBuilder = new PhoneBuilder();  //Issue with code readability because in this line Client doesn't know how PhoneBuilder is related with Creating phone object.
        //so we should create Object of PhoneBuilder using Phone class .

    /*    phoneBuilder.setBattery(" 5000 mAh");
        phoneBuilder.setOs("Note 8");
        phoneBuilder.setBrand("MI");
        phoneBuilder.setOsVersion(8);*/

       // Phone p = phoneBuilder.build();

        //In above case we are using Phone public constructor in PhoneBuilder to create object .
        //So We have access to create Phone object directly without go ing through PhoneBuilder ..

        //  System.out.println(p);


       // PhoneBuilder builder = Phone.getBuilder();// Right way to create object of phone builder/

       Phone phone = Phone.getBuilder().setBattery("500 mah").setBattery("Note 8").setBrand("Mi").setOsVersion(8).build();
       System.out.println(phone);
    }
}
