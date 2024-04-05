package clases.CoreJava;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        // list modified
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        for (Integer i : nums) {
            System.out.println(i);
        }
        for (int i = 0; i < nums.size(); i++ ){
            System.out.println(nums.get(i));
        }
        System.out.println(nums.indexOf(2));


        // set
        // can't have a repeated value and doesn't follow sequnce

        Set<Integer> nums2 = new HashSet<Integer>();
        nums2.add(512);
        nums2.add(212);
        nums2.add(312);

        for (Integer i : nums2) {
            System.out.println(i);
        }

        //follows sequence
        Set<Integer> nums3 = new TreeSet<Integer>();
        nums3.add(1);
        nums3.add(2);
        nums3.add(3);
        for (Integer i : nums3) {
            System.out.println(i);
        }

        // map
        // supports key and value pair, doesn,t follow sequnce
        // keys are unique, values can be updated.
        Map<String, Integer> students = new HashMap<String, Integer>();
        students.put("Vishal",1);
        students.put("Mary",2);
        students.put("John",3);

        System.out.println(students);

        System.out.println(students.get("Vishal"));
        System.out.println(students.keySet());
        for (String key : students.keySet()) {
            System.out.println(key);
        }

        //for syncrozine we can use HashTable ie for using with threads
    }
}
