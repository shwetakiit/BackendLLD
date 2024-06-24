package kumari.shweta.DesignPattern.PrototypeDesign;

import java.util.HashMap;
import java.util.Map;

public class PolicyHolderRegistry {

    private Map<String,PolicyHolder> map = new HashMap<String,PolicyHolder>();

   void  register(String key , PolicyHolder policyHolder){

        map.put(key , policyHolder);
    }

   PolicyHolder  get(String key){
        return map.get(key);
    }
}
