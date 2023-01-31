/*class Sorting1 {
   static void bubbleSort(int[] arr) 
   {  
      int n = arr.length;  
      int temp = 0;  
      for(int i = 0; i < n; i++){  
         for(int j = 1; j < (n-i); j++)
         {  
            if(arr[j-1] > arr[j]){  
               //swap elements  
               temp = arr[j-1];  
               arr[j-1] = arr[j];  
               arr[j] = temp;  
            }          
         }  
      }
   }  
   public static void main(String[] args) 
  {  
      int arr[] = {16,20,56,89,103};
      System.out.println("Before Sort");  
      for(int i = 0; i < arr.length; i++)
      {  
         System.out.print(arr[i] + " ");  
      }  
      System.out.println();  
      bubbleSort(arr);
      System.out.println("After  Sort");  
      for(int i = 0; i < arr.length; i++)
      {  
         System.out.print(arr[i] + " ");  
      }  
   }
}  */


/*class BubbleSort
{
    public static void sort(int arr[])
    {
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
    }
    public static void main(String args[])
    {
        int a[]={34,12,78,56,45,66};
        System.out.println("before sorting");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        sort(a);
        System.out.println();
        System.out.println("after sorting");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}  */




public class Sorting1
{  
    public static void selectionSort(int[] arr)
  {  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++)
            {  
                if (arr[j] < arr[index])
                {  
                    index = j;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }         
    public static void main(String a[])
  {  
        int[] arr1 = {17,29,6,98,36,48};  
        System.out.println("Before Selection Sort");  
        for(int i:arr1)
        {  
            System.out.print(i+" ");  
        }  
        System.out.println();           
        selectionSort(arr1);
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
}  