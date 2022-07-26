import java.util.*;
class calc                                 //parent class
{
     public static int add(int i,int j)
     {
         return i+j;
     }
}
class calcadv extends calc                    //child class
{
    public int sub(int i,int j)
    {return i-j;
    }
}
class adv extends calcadv
{
    public  int mult(int i,int j)
    {return i*j;
    }
}

class Inheritence{
    public static void main(String[] args)
    {adv obj=new adv();
    int r1=obj.add(4,5);
      int r2=obj.sub(5,1);
      int r3=obj.mult(5,1);
      System.out.println(r1+"\n");
       System.out.println(r2+"\n");
        System.out.println(r3+"\n");
}
}