package veh;

public class Height {
    int age;
    int weight;
    int height;

    public static void main(String[] args) {
        /*Height ben=new Height(); /// create object
        Height ashu=new Height();
        ben.height=5; // assign parameter to variable
        ashu.height=3;
        System.out.println("Ben height is "+ben.height);
        System.out.println("Ashu heigt is "+ashu.height); */

       // String s="Welcome"; //string literal
        //System.out.println(s); // String created using literal
        String x=new String("Welcome"); // string ceated using new keyword
        System.out.println(x);
/// String in build method
        System.out.println(x.length());//number of character
        System.out.println(x.replace("e","a")); // replace character

    }

}
