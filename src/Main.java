// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to basic programing");
        Line l1=new Line();
        l1.ep1=new Point();
        l1.ep1.x=10;
        l1.ep1.y=20;
        l1.ep2=new Point();
        l1.ep2.x=100;
        l1.ep2.y=200;
        float Length1=l1.calculateLength();
        System.out.println("length1"+Length1);
        Line l2=new Line();
        l2.ep1=new Point();
        l2.ep1.x=7;
        l2.ep1.y=70;
        l2.ep2=new Point();
        l2.ep2.x=80;
        l2.ep2.y=200;
        float Length2= l2.calculateLength();
        System.out.println("length2" +Length2);


    }
}