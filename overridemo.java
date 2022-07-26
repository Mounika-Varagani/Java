
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
        System.out.println("in B");
        
    }
   
     
}

class overridemo {
    public static void main(String[] args) {
        B obj=new B();
           obj.show();
          
        
    }
}