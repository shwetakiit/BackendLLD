package kumari.shweta.DesignPattern.PrototypeDesign;



public class Student implements ProtoType<Student> {

   private String name;
   private int age;
   private String batch;
    private  double avgBatchPSP;
    private  double studentPSP;

    Student(){

    }

    Student(Student student){ //Use copy constructor feature If all attribute are private and no getter setter

        this.name=student.name;
        this.age=student.age;
        this.batch=student.batch;
        this.avgBatchPSP=student.avgBatchPSP;
        this.studentPSP=student.studentPSP;

    }
    //Lets keep all attribute private and remove getter
 /*   public double getStudentPSP() {
        return studentPSP;
    }

    public void setStudentPSP(double studentPSP) {
        this.studentPSP = studentPSP;
    }


  */
    public double getAvgBatchPSP() {
        return avgBatchPSP;
    }

    public void setAvgBatchPSP(double avgBatchPSP) {
        this.avgBatchPSP = avgBatchPSP;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

/*
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
*/


    @Override
    public Student clone() {
        return new  Student(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batch='" + batch + '\'' +
                ", avgBatchPSP=" + avgBatchPSP +
                ", studentPSP=" + studentPSP +
                '}';
    }
}
