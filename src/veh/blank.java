package veh;

public class blank {


        public static void main(String args[]){
            String s="Sachin";
            s.concat(" Tendulkar");//concat() method appends the string at the end
            System.out.println(s);//will print Sachin because strings are immutable objects
        }

   public class StringBufferExample{
        public static void main(String args[]){
            StringBuffer sb=new StringBuffer("Hello ");
            sb.append("Java");//now original string is changed
            System.out.println(sb);//prints Hello Java
        }
        class StringBuilderExample{
            public static void main(String args[]){
                StringBuilder sb=new StringBuilder("Hello ");
                sb.append("Java");//now original string is changed
                System.out.println(sb);//prints Hello Java
            }
        }

    }
}

