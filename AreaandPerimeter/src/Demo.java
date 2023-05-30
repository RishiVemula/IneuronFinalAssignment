interface Shape
{
    void perimeter();
    void area();
}
class Circle implements Shape
{
    int r = 5;
    double pi = 3.14, ar = 0,p=0;
    @Override
    public void perimeter()
    {
    	p= 2* pi * r;
    	  System.out.println("perimeter of circle:"+p);
    }
    @Override
    public void area() {ar = pi * r * r;
    System.out.println("Area of circle:"+ar);
}
}
class Rectangle implements Shape
{
    int l = 5, b = 3;
    double ar=0,p=0;
    public void perimeter()
    {
    	p= 2*(l+b);
    	  System.out.println("perimeter of rectangle:"+p);
        
    }
    public void area()
    {
       
        ar = l * b;
        System.out.println("Area of rectangle:"+ar);
    }
}
class Triangle implements Shape
{
    int a = 5, b = 3, c=2,h =3;
    double ar=0,p=0;
    public void perimeter()
    {
    	p= a+b+c;
    	  System.out.println("perimeter of triangle:"+p);
        
    }
    public void area()
    {
       
        ar = (b*h)/2;
        System.out.println("Area of triangle:"+ar);
    }
}



public class Demo
{
    public static void main(String[] args)
    {    Shape obj1 = new Circle();
          obj1.perimeter();
          obj1.area();
        Shape obj2 = new Rectangle();
        obj2.perimeter();
        obj2.area();
        Shape obj3=new Triangle();
        obj3.perimeter();
        obj3.area();
        
        
    }
}
