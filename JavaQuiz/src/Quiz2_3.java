import java.util.Scanner;

class LinearEquation{
    private double a,b,c,d,e,f;

    public LinearEquation(double a,double b,double c,double d,double e,double f) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getD(){
        return this.d;
    }
    public double getE() {
        return this.e;
    }
    public double getF() {
        return this.f;
    }
    public void setA(int a) {
        this.a=a;
    }
    public void setB(int b) {
        this.b=b;
    }
    public void setC(int c) {
        this.c=c;
    }
    public void setD(int d) {
        this.d=d;
    }
    public void setE(int e) {
        this.e=e;
    }
    public void setF(int f) {
        this.f=f;
    }
    public boolean isSolvable() {
        if(a*d-b*c!=0)
            return true;
        return false;
    }
    public double getX() {
        return (e*d-b*f)/(a*d-b*c);
    }
    public double getY() {
        return (a*f-e*c)/(a*d-b*c);
    }

}
public class Quiz2_3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input a,b,c,d,e,f:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        double f=sc.nextDouble();
        LinearEquation equation= new LinearEquation(a,b,c,d,e,f);
        if(!equation.isSolvable()) {
            System.out.println("The equation has no sulotion");
        }else {
            System.out.println("The X is:"+equation.getX());
            System.out.println("The Y is:"+equation.getY());
        }
        sc.close();

    }

}
