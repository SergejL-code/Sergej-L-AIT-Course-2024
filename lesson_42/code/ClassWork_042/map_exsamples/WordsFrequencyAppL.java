package ClassWork_042.map_exsamples;

import java.util.HashMap;
import java.util.Map;

public class WordsFrequencyAppL {
    public static void main(String[] args) {


        String[] words = {"a", "abc", "ab", "1a1","limit", "ab", "a","1a", "ab", "limit", "a", "a", "a","1a"};

        printWordFrequency(words);

    }//end of main

    private static void printWordFrequency(String[] words) {
      //Key - это слово, value - это сколько раз оно попалось в массиве
        Map<String,Integer> resultMap = new HashMap<>();
        for (String w : words) {

            if(!resultMap.containsKey(w)){// когда слово попалось 1-й раз
                resultMap.put(w,1);
            }else{// когда слово уже такое есть в Map
                resultMap.put(w,resultMap.get(w)+1);// увеличиваем частоту на 1
            }
        }
     // print resultMap
        for (String word1 : resultMap.keySet() ) {
            System.out.println("Word " + word1 + ", frequency: " + resultMap.get(word1) );
        }
    }

}
