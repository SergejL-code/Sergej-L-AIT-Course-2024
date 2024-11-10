package ClassWork_042.map_exsamples;

import java.util.HashMap;
import java.util.Map;

public class MenAndWoman {
    public static void main(String[] args) {

// m-male,f-female
        Map<String, String> genderMap = new HashMap<>();
        genderMap.put("LK", "m");
        genderMap.put("AD", "m");
        genderMap.put("DM", "m");
        genderMap.put("GA", "f");
        genderMap.put("JR", "m");
        genderMap.put("OF", "f");
        genderMap.put("DV", "f");
        genderMap.put("GT", "f");
//        Map<String, Character> genderMap = new HashMap<>();
//        genderMap.put("LK", 'm');
//        genderMap.put("AD", 'm');
//        genderMap.put("DM", 'm');
//        genderMap.put("GA", 'f');
//        genderMap.put("JR", 'm');
//        genderMap.put("OF", 'f');
//        genderMap.put("DV", 'f');
//        genderMap.put("GT", 'f');


        //1 Variant проходим Keys,keySet
        System.out.println("**************************** 1 Variant Keys  ******************************************");

        int men= 0;
        for (String key : genderMap.keySet()) {
            if(genderMap.get(key).equals("m") ){
                men++;
            }
        }
        int s = genderMap.size();
        int  woman = s-men;

        System.out.println("Men: " + men + " Woman: " + woman );
        // 2 Variant проходим по values, values()
        System.out.println("**************************** 2 Variant Values  ******************************************");
        men=0;
        woman=0;
        for (String value : genderMap.values()) {
            if (value.equals("f")){
                woman++;
            }
        }
        System.out.println(woman);



    }
}
