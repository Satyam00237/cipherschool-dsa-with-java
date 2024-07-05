import java.util.*;
import accessModifiers1.A;
public class A
{
int x= 10;
private int y = 15;
public int z= 20;
protected int w= 25;

public static void main (String[] args)
{
A obj=new A();
System.out.println(obj.x);
System.out.println(obj.y);
System.out.println(obj.z);
System.out.println(childObj.w); 
}
}


//*************************//
import java.util.*;
import accessModifiers1.A;
public class B
{
public static void main (String[] args)
{
A obj=new A();
System.out.println(obj.x); 
System.out.println(obj.y); //private not accessible outside the class
System.out.println(obj.z); //public is accessible everywhere outside the class
System.out.println(childObj.w); //protected will be visible in different package in subclass using object 
}
}

//***********//
import java.util.*;
import accessModifiers2;

public class C extends A{
public static void main (String[] args)
{
A obj=new A();
C childObj = new C();
// System.out.println(childObj.x);
// System.out.println(childObj.y);//private not accessible outside the class 
System.out.println(obj.z);
System.out.println(childObj.w); //protected will be visible in different package in subclass using object 

}
}

//***********************//

import java.util.*;
import accessModifiers1.A;
public class D
{
public static void main (String[] args)
{
A obj=new A();
System.out.println(obj.x);
System.out.println(obj.y);
System.out.println(obj.z);
System.out.println(obj.w); //protected will not be accessible outside package in non-subclass
}
}

/////*******Encapsulation**********//////

import java.util.*;
import encapsulation;
class Demo
{
private int a =5;

private int b =10

private int c =15;

private int d =20;
}
public int getA()
{
System.out.println("Value of B read");
return this.a;
}
public int getB()
{
System.out.println("Value of B read");
return this.b;
}

public void SetA(int a)
{
if(a>100)
{
this.a = a;
System.out.println("Value of A changed to: "+a);
}
else
{
System.out.println("Cannot set");
}
} 

public void setB(int b)
{
this.b =b;
}

public int getC()
{
return c;
}

public void setD(int d)
{
this.d = d;
}
}

public class EncapStudy
{
public static void main(String[] args)
{
Demo d = new Demo()
System.out.println(d.a); //not visible because private
System.out.println(d.getA());
d.setA(100);
System.out.println(d.getA());
}
}
