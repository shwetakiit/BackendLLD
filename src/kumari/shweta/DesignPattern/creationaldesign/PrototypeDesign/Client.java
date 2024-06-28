package kumari.shweta.DesignPattern.creationaldesign.PrototypeDesign;

public class Client {

    public static void fillRegistory(PolicyHolderRegistry policyHolderRegistry){
        PolicyHolder policyHolder = new PolicyHolder();

        //Let's set general parameter.Name ,age ,etc can be customized. As soon as application start It should load the registry

        policyHolder.setInstallmentAmount(50000);
        policyHolder.setPolicyName("Life Insurance Policy");
        policyHolderRegistry.register("LifeInsurancePolicyHolder", policyHolder);

        //Get clone of Template for creating Object of PolicyHolder.
        PolicyHolder lifeInsurancePolicyHolderTemplate =  policyHolderRegistry.get("LifeInsurancePolicyHolder").clone();

    }

    public static void main(String[] args) {

    }
}
