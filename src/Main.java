import java.util.*;
class Calculator {
    int add(int a , int b)
    {
        return a + b;
    }

    int sub(int a , int b)
    {
        return a - b;
    }
}

public class Main extends Calculator {
    int multi(int a , int b)
    {
        return a * b;
    }

    int div(int a , int b)
    {
        return a / b;
    }

    public static void main(String args[])
    {
       Main cal = new Main();
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter your operation!");
        int n=sc.nextInt();
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();

        switch(n){
            case 1:
                System.out.println( cal.add(a,b) );
                break;
            case 2:
                System.out.println( cal.sub(a, b) );
                break;
            case 3:
                System.out.println( cal.multi(a, b) );
                break;
            case 4:
                System.out.println( cal.div(a, b) );
                break;

        }





    }
}