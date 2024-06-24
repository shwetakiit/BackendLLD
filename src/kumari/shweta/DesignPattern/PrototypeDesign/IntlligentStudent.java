package kumari.shweta.DesignPattern.PrototypeDesign;

public class IntlligentStudent extends Student {

    int iq;

    public IntlligentStudent(IntlligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq= intelligentStudent.iq;
    }

    @Override
    public IntlligentStudent clone() {

        IntlligentStudent intlligentStudent = new IntlligentStudent(this);
        return intlligentStudent;
    }
}
