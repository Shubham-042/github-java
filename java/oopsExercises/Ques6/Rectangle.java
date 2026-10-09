package oopsExercises.Ques6;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        length=width=1;
    }
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }


    public void setLength(double length){
        this.length=length;

    }

    public void setWidth(double width){
        this.width=width;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area(){
        return length*width;
    }

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setLength(2);
        r.setWidth(4);
        System.out.println(r.area());
    }
}
