class Over
{
float pi=3.14f;
void area(int r)
{
System.out.println("area of circle:"+(pi*r*r));
}
void area (int length,int breadth)
{
System.out.println("area of rectangle:"+(length * breadth));
}
public static void main (String[] args)
{
Over obj=new Over();
obj.area(5);
obj.area(4,6);
}
}

