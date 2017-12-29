package ooplab6;

public class myString {
    public static void main(String[] args) {
        char []c = {'H','e','l','l','o'};
        String strl = new String(c);
        System.out.println(strl);

        String str2 = "Watchara manop";
        System.out.println(str2);

        String str3 = new String("RMUTSV");
        System.out.println(str3);

        //concatenation String
        //type (+)
        String  str4 = strl +" "+ str2;
        System.out.println(str4);
        //type (concat() method)
        String str5 = strl.concat(" "+str3);
        System.out.println(str5);

        //string size
        int lengrh = str4.length();
        System.out.println(lengrh);
        System.out.println(str5.length());

        //String method
        System.out.println(str5.toLowerCase());
        System.out.println(str5.toUpperCase());
        System.out.println(str5.replace('l','s'));
        System.out.println(str5.indexOf('V'));

        //trim()
        String str6 = "  Hello  ";
        System.out.println(str6.length());
        System.out.println("*"+str6+"*");
        System.out.println("*"+str6.trim()+"*");









    }//main
}//class
