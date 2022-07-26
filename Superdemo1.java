
import java.util.*;
class A            //super class
{
     public  void  show()
    {
        System.out.println("in A\n");
        
    }
    
}

class B extends A{           //sub class
   
    public  void show()
    {
        // super.show();   to call the super class method     
        System.out.println("in B\n");
        
    }
}
   
   class C extends A{           //sub class
   
    public  void show()
    {
           
        System.out.println("in C");
        
    }
     
}

class Superdemo1 {
    public static void main(String[] args) {
        A obj=new B(); //runtime polymorphism
           obj.show();
           obj=new C();  //once u change the reference it calls different method it is called as (dynamic method dispatch)
           obj.show();
          
        
    }
}
import java.util.*;
class A            //super class
{
     public  void  show()
    {
        System.out.println("in A\n");
        
    }
    
}

class B extends A{           //sub class
   
    public  void show()
    {
        // super.show();   to call the super class method     
        System.out.println("in B\n");
        
    }
}
   
   class C extends A{           //sub class
   
    public  void show()
    {
           
        System.out.println("in C");
        
    }
     
}

class Superdemo1 {
    public static void main(String[] args) {
        A obj=new B(); //runtime polymorphism
           obj.show();
           obj=new C();  //once u change the reference it calls different method it is called as (dynamic method dispatch)
           obj.show();
          
        
    }
}