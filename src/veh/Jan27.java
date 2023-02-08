package veh;

public class Jan27 {
    public static void learning() {

        //****type of data type string,int,float,boolen

        //*****DIsplay of variable to add one or more variable use +
        //string name ="Ben";
        //int age =45;
        ///System.out.println(name+age);

        ///****Indentifier all variable should be indentified by unique name

        //String default method length,toupper case,
        String name = "Benazir Adam Sayyad";
        ///length of word
        System.out.println(name.length());
    }
    ///****type casting Widening Casting
    public static void main(String[] args) {
        int age =9;
        double dage=age;//automatic casting of double
        System.out.println(age);
        System.out.println(dage);
        ///***type casting Narrowing Casting ,
// Narrowing casting must be done manually by placing the type in parentheses in front of the value:
        double salary =5000000.0;
        int newsalary=(int) salary;///Manual casting double to int
        System.out.println(salary);
        System.out.println(newsalary);

    }




}




