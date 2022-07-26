import java.util.*;
class bags{
	public static void main(String[] args)
	{
     int bags=10;
     int capacity=10;
     int sum=0;
     int weights[]={12,3,4,6};
     int pacity=bags*capacity;
     for(int x:weights)
     {sum=sum+x;
     }
     System.out.println(sum);
     if(pacity<sum)
     {System.out.println(weights[0]); 
     }
     else
     {
     System.out.println(weights[weights.length-1]);
     }
	
		
	}
}
