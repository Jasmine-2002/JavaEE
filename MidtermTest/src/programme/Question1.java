package programme;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int a,b,c;
        double area,s;
        Scanner rd=new Scanner(System.in);
        a=rd.nextInt();
        b=rd.nextInt();
        c=rd.nextInt();
        if(a+b>c&&a+c>b&&b+c>a){
            s=(a+b+c)/2;
            area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.print("The area is: "+String.format("%.3f",area));
        }else{
            System.out.print("It can not be created a triangle.");
        }
    }
}

