package main.masterlogic;

import java.util.*;

public class calculationClass {
    public class longestWord {
        final String words = null;

        {


            String ss[] = words.split(" ");

            List<String> vardi = new ArrayList<>();

            Map<Integer, String> set = new Hashtable<Integer, String>();

            int i = 0;
            for (
                    String str : vardi) {
                set.put(str.length(), str);
                System.out.println(vardi.get(i));
                i++;
            }


            Set<Integer> keys = set.keySet();

            System.out.println(keys);
            System.out.println(set);

            Object j[] = keys.toArray();

            Arrays.sort(j);

            Object max = j[j.length - 1];

            set.get(max);

            System.out.println("Tha longest word is " + set.get(max));
            System.out.println("Length is  " + max);


        }
    }
}