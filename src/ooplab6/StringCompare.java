package ooplab6;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Helloooo";
        //compare String
        //type 1 (==) T/F
        if (str1 == str2) System.out.println("true");
        else  System.out.println("false");
        //type 2 (equals() mathod)
        if (str1.equals(str2)) System.out.println("true");
        else  System.out.println("false");
        //type (compareTo() methood)
        //0 = Sting is equal.
        //- = Left String is less than Right String
        //+ = Left String is more than Pight String
        if (str1.compareTo(str2)==0)
            System.out.println("true");
        else if (str1.compareTo(str2)>=1)
            System.out.println("str1 is more than str2");
        else
            System.out.println("str1 is more than str2");


    }//main
}//class
