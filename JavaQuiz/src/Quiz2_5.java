public class Quiz2_5 {

    double x;
    double y;
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public Quiz2_5(){
        x=0;
        y=0;
    }
    public Quiz2_5(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double distance(double x,double y){
        double s;
        s = Math.sqrt((this.x - x) * (this.x - x)+(this.y - y) * (this.y - y));
        return s;

    }
    public double distance(Quiz2_5 mypoint){
        double s;
        s = Math.sqrt((this.x - mypoint.getX()) * (this.x - mypoint.getX())+(this.y - mypoint.getY()) * (this.y - mypoint.getY()));
        return s;
    }

    public static void main(String[] args) {
        Quiz2_5 point1=new Quiz2_5(0,0);
        Quiz2_5 point2=new Quiz2_5(10,30.5);
        System.out.println("The distance1 is "+point1.distance(point2));

    }

}



