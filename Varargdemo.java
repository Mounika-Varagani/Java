// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class cls{
    public int add(int ...i)  // it treated  the arguments in array format {2,3,4,5,7}
{int sum=0;
for(int j:i)
   { 
       sum=sum+j;
    }
 return sum;
}
}


class Varargdemo {
    public static void main(String args[])
    {
       
      cls obj=new cls();
      System.out.println(obj.add(2,3));
      System.out.println(obj.add(2,3,4,5,7));
    System.out.println(obj.add(2,33,4,5,7,7));
       
       
    }
 
    
}