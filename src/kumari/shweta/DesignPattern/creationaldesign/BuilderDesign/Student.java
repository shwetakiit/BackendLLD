package kumari.shweta.DesignPattern.creationaldesign.BuilderDesign;

public class Student {

    int id;
    String name;
    int age;
    int gradYear;
    double psp;
    String univName;

    Student(StudentBuilder builder) {

        this.id = builder.id;;
        this.name = builder.name;
        this.age = builder.age;;
        this.gradYear = builder.gradYear;
        this.psp = builder.psp;
        this.univName = builder.univName;
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", univName='" + univName + '\'' +
                '}';
    }

    static class StudentBuilder{

        int id;
        String name;
        int age;
        int gradYear;
        double psp;
        String univName;

        public int getId() {
            return id;
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public StudentBuilder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public Student build(){
            //Validation before creating object of Student
            if(age<25){
                throw new IllegalArgumentException("Age is less than 25");
            }

            return new Student(this);
        }
    }
}
