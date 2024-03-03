package string;

import java.util.Scanner;

public class StringTestFindAnything {

    public Scanner sc = new Scanner(System.in);

    //Using contains method
    public void findWordInString(String s)
    {
        System.out.println("Enter a word to search in String");
        String word = sc.nextLine();

        if(s.contains(word))
        {
            System.out.println("'" +word + "'" +" found in String");
        }
        else
            System.out.println("'" +word +"'" + " not available in String");
    }

    //By manual method
    public void findWordInString2(String s1)
    {
        System.out.println("Enter a word to search in String");
        String word1 = sc.nextLine();

        String[] SearchWord = s1.split("//s+");
        for(String t : SearchWord )
        {
            if(t.equals(word1))
            {
                System.out.println("'"+word1+"'" + " found in String");
                break;
            }  
            else
                System.out.println("'"+word1+"'" + " not found in String");
        }
    }

    public static void main(String[] args)
    {

        StringTestFindAnything obj = new StringTestFindAnything();
        obj.findWordInString("This is what i am thinking in the mid of my lecture");

    }

}
