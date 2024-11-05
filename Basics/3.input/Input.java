import java.util.*;

public class Input{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("Your Input is :===>"+name);

        // String name_2 = sc.nextLine();
        //  System.out.println("Your Input is :===>"+name_2);

        //  int numberOne = sc.nextInt();
        //  System.out.println(numberOne);

        // byte bt = sc.nextByte();
        // System.out.println(bt);

        // short sh = sc.nextShort();    
        // System.out.println(sh);

        // Long lg = sc.nextLong();
        // System.out.println(lg);


        //  char ch = sc.nextChar();  not type of nextChar() is available in Scanner class
        
        // double db = sc.nextDouble();
        // System.out.println(db);

        // boolean bl= sc.nextBoolean();
        // System.out.println(bl);

        //ADDING TWO NUMBER USING INPUTS
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("Sum of your BOTH NUMBER IS "+(a+b));

        //PRODUCT OF TWO NUMBERS
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(a*b);

        //AREA OF CIRCLE
        float pie = 3.14f;
        float radius = sc.nextFloat();
        float area = pie * radius* radius ;
        System.out.println(area);

    }

}