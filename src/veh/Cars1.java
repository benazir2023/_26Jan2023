package veh;
/// learn to create new object
public class Cars1 {
    String type; //cheap or expensive
    String num; /// count of cars

    public static void main(String[] args) {
        Cars1 maruti=new Cars1();//object1
        Cars1 benz=new Cars1();//object2
        maruti.type="cheap";
        benz.type="expensive";
        System.out.println("Maruti type is "+maruti.type);
        System.out.print(benz.type);

    }


  }


