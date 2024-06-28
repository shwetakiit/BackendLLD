package kumari.shweta.DesignPattern.creationaldesign.BuilderDesign;

public class ClientStudent {

    public static void main(String[] args) {
        Student student = Student.getBuilder().setUnivName("KIIT").setName("SHK").setAge(25).build();
        System.out.println(student);

    }
}
