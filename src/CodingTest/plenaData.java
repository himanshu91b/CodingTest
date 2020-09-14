package CodingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class plenaData extends Throwable { // extended with thowable in case to throw any exceptions. (Inherited class)

    Map<Character, Integer> map = new HashMap<>();  // Declared globally to reduce code repetition and complexity

    public void codeChallenge(String s) //This class calls methods and show the result on console.
    {
        System.out.println("Entered String Is: " + s);

        System.out.println("First Non Repeating Character in the String Is: " + firstUnique(s));

        System.out.println("String sorted by number of occurrence: " + sortOccurrences(s));
    }

    private Character firstUnique(String s) // Private method to hide implementation from main class (Encapsulation)
    {
        for (char c : s.toLowerCase().toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (char c : s.toLowerCase().toCharArray()) {
            if (map.get(c) == 1) {
                return c;  // Returning the first occurrence char.
            }
        }
        return 0;
    }

    private String sortOccurrences(String s)  // Private method to hide implementation from main class (Encapsulation)
    {
        StringBuilder res = new StringBuilder();
        PriorityQueue<Character> p = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));  // queue to sort as per the occurrence.
        p.addAll(map.keySet());
        while (!p.isEmpty())
        {
            char temp = p.remove();
            for (int i = 0; i< map.get(temp);i++)
            {
                res.append(temp);
            }
        }
        return res.reverse().toString();
    }
}


