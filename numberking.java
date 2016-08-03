import java.util.*;

class numberking
{
      public static void main(String args[])
    {
          int n,rev=0,pow=1,i;

         Scanner scn=new Scanner(System.in);

         System.out.print("Enter any no :");   	
          n=scn.nextInt();
          int dup=n,count=0;
	
           while(dup!=0)
	{
		
		dup/=10;count++;
		
	}

	for(i=0;i<count;i++)
		{
                                           pow*=10;
    		}pow=pow/10;		
	int sum=0;
	
	dup=n;		
           for(i=0;i<count;i++)
	{
		rev+=(dup%10)*pow;
		sum+=dup%10;
		pow/=10;
		dup/=10;
	}

	
	
       
		System.out.println("it is a "+count+" digit number");
		System.out.println("sum of digits are "+sum); 
		System.out.print(rev+" is the reverse of this number");        

}
}
       