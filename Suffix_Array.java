package Advanced_ds_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by sachin on 1/2/2018.
 */
//A suffix array is a sorted array of all suffixes of a given string
public class Suffix_Array {
    public static void main(String[] args) {
        TreeMap<String,Integer>suffixarray=new TreeMap<>();//treemap automatically sorts
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       // String s="Sachin is a good boy";
        String s="banana";
        for (int i = 0; i <s.length() ; i++) {
            suffixarray.put(s.substring(i,s.length()),i);
        }
        //finding all elements of suffix array
        for (Map.Entry<String, Integer> key:suffixarray.entrySet()
             ) {
            System.out.println(key.getKey()+"  "+key.getValue());
        }
    }


}
