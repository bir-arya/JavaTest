package string;

import java.util.HashMap;

public class FindDistinctVowels {

    public static void main(String args[])
    {
        String givenString = "aeiou aeiou aeiou iiiiieeeee";

        HashMap<String, Integer> vowel = new HashMap<>();

        int a=1; int e=1; int i=1; int o=1; int u=1;
        for(int j=0; j<givenString.length(); j++)
        {
            if (givenString.charAt(j)=='a' || givenString.charAt(j)=='A') {
                vowel.put("a", a++);   
            }

            else if (givenString.charAt(j)=='e' || givenString.charAt(j)=='E') {
                vowel.put("e", e++);   
            }

           else  if (givenString.charAt(j)=='i' || givenString.charAt(j)=='I') {
                vowel.put("i", i++);   
            }

            else if (givenString.charAt(j)=='o' || givenString.charAt(j)=='O') {
                vowel.put("o", o++);   
            }

           else if (givenString.charAt(j)=='u' || givenString.charAt(j)=='U') {
                vowel.put(
                    "u", u++);   
            }
        }

        System.out.println(vowel);
    }
}
