
import java.util.*;
class A
{
    public A()
    {
        System.out.println("in A\n");
        
    }
    
     public A(int j)
    {
        System.out.println("in A -with parameter");
        
    }
}

class B extends A{
   
    public B()
    {
         super();       //if we want to call A const with paarmeter use super(3)
        System.out.println("in B");
        
    }
   
     public B(int j)
    {
         super();    //if we want to call A const with paarmeter use super(3)
        System.out.println("in B -with parameter");
        
    }
}

class Superdemo {
    public static void main(String[] args) {
        B obj=new B();
           B obj2=new B(5);
        
    }
}