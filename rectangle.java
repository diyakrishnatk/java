class rectangle
{
double length;
double breadth;
double area()
{
return length* breadth;
}
public static void main(String args[])
{
rectangle rect1=new rectangle();
rectangle rect2=new rectangle();
rect1.length=10;
rect1.breadth=20;
rect2.length=30;
rect2.breadth=40;
System.out.println("Area of rect1:"+rect1.area());
System.out.println("Area of rect2:"+rect2.area());
}
}
