
 class ArmStrong
{
public static void main(String[] args)
{
    int num=153;
    int original=num;
   
    int length=0,sum=0;
   
    while(num!=0)
    {
       
        length=length+1;
         num=num/10;
    }
    System.out.println(length);
     int num1=original;
    while(num1!=0)
    {
         int result=1;
        int digit=num1%10;
        for(int i=1;i<=length;i++)
        {
            result=result*digit;
           }
        sum=sum+result;
        num1=num1/10;
    }
    if(original==sum)
    {
        System.out.println("amstrong number");
    }
    else
    System.out.println("not amstrong ");
}
}

