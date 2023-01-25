public class Bitwise_Operator { 

    public static void main(String[] args)  { 
        
        //Variable declaration and initialization
        int a = 5; 
        int b = 7; 

        // Bitwise AND will work on internal bit pattern of 5 & 7 here i.e., 00000101 & 00000111 
        System.out.println("a&b = " + (a & b)); 

        // Bitwise OR 00000101 | 00000111 = 00000111 = 7 
        System.out.println("a|b = " + (a | b));
    
    } 
} 