package oop_lab.s359211110138.rmutsv.com.ooplab2;

public class TestVariabel {
    public static void main(String[] args) {
 //       Integer
        int i;
        i = 10;
        System.out.println("i =" + 1);
        int j = 20;
        System.out.println("j = " + j);
        System.out.println("i+j = " + (i + j));
 //       double
        double v = 15.15;
        System.out.println(v);
        System.out.println(v * 10);
 //       character
        char c = 'T';
        System.out.println(c);
  //      string
        String s = "Hello world";
        System.out.println(s);
        String name = "I'm MOS";
        System.out.println(name);
        String msg = s + " " + name;
        System.out.println(msg);
        String msg2 = s.concat(" "+name);
        System.out.println(msg2);
        System.out.println(msg.length());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());

  //      boolean
        boolean b = true;
        boolean b1 = false;
        System.out.println(b);
        System.out.println(b1);
    }//main
}
