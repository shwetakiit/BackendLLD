package kumari.shweta.DesignPattern.PrototypeDesign;

public class PolicyHolder  implements  ProtoType<PolicyHolder>{

    String name;
    int age ;
    String policyName;
    double installmentAmount;
    int installmentType;
    String policyNumber;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public int getInstallmentType() {
        return installmentType;
    }

    public void setInstallmentType(int installmentType) {
        this.installmentType = installmentType;
    }

    public double getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(double installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

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

    @Override
    public PolicyHolder clone() {

        PolicyHolder copy= new PolicyHolder();
        copy.name= this.name;
        copy.age= this.age;
        copy.policyName= this.policyName;
        copy.installmentAmount= this.installmentAmount;
        copy.installmentType= this.installmentType;
        copy.policyNumber= this.policyNumber;
        return copy;
    }
}
