/*  JFM1T11_Assignment5 :

    Write a program to sort an array containing negative, non-negative and zero values in descending order.
    Prompt the user input from the terminal.
    
    Sample Input: 2,-3,-1,4,-2
    
    Expected Output: -3,-2,-1,4,2
    
*/

import java.util.*;
public class RearrangePositiveNegative 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();   
        int arr[]=new int[n];  
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)     
        {
            arr[i]=sc.nextInt();
        }        
        int temp = 0;        
         for (int i=0;i<n;i++)   
         {     
            for (int j=i+1;j<n;j++)    
            {     
               if(arr[i]<arr[j])
               {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }             
        System.out.println();       
      System.out.println("Elements of array sorted in descending order is: ");    
        for (int i=0;i<n;i++) 
        {     
          System.out.print(arr[i]+" ");
        }
    }
}



//main method

//take input from user

//call descending method

//print result

//create descending method

//declare and initialize variables

//check each element if the element is less then zero and the both numbers are not equal  then it swaps them

//increasing elements untill all elements rearranged

