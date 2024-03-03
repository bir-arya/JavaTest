package string;

public class StringTest1 {
       
    public static void main(String[] args) {
        
        StringTest1.str1();
        StringTest1.st2("Birjoo Arya");
        StringTest1.trimString();
    
    }

    public static void str1()
    {
        String s1 = "Hello";
        String s2 = "Wordl";

        System.out.println(s1+ " " +s2);
    }

    public static void st2(String s)
    {
        String s3 = "My name is : ";
       System.out.println(s3.concat(s));
    }

    public static void trimString()
    {
        String s4 = "This is a new class for the testing purpose";
       // String[] s5 = new String[s4];
       System.out.println(s4); 
       System.out.println(s4.trim());
       String[] s6 = s4.split(" ");
       for(String s : s6)
       {
            System.out.println(s);
       }

    }

}
