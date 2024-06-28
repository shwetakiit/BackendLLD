package kumari.shweta.DesignPattern.creationaldesign.PrototypeDesign;

public class StudentClient {

    public static void fillRegistry(StudentRegistry studentRegistry) {


        Student student = new Student();

        student.setBatch("JulyBatch");
        student.setAvgBatchPSP(80.9);
        studentRegistry.register("JulyBatch", student);


    }

    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        ;
        fillRegistry(studentRegistry);
        Student student = studentRegistry.get("JulyBatch").clone();
        System.out.println(student.toString());


    }
}

