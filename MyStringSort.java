import java.util.Scanner;


public class MyStringSort
{
    // Main method
    public static void main(String[] args)
    {
        String[] arr = new String[15];
        int size = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter up to 15 strings. Enter Quit to quit: ");
        while(size != 15)
			
			// can you comment the way to do this next part more efficiently? Thanks!
        {
            String temp = sc.nextLine();
            if(temp.compareTo("Quit") == 0)
                break;
        
            if(temp.compareTo("QUIT") == 0)
                break;
        
            if(temp.compareTo("quit") == 0)
                break;
			
			if(temp.compareTo("QUit") == 0)
            	break;
            
			if(temp.compareTo("QUIt") == 0)
                break;
           
			if(temp.compareTo("qUit") == 0)
                break;
            
			if(temp.compareTo("qUIt") == 0)
                break;
            
			if(temp.compareTo("qUIT") == 0)
                break;
            
			if(temp.compareTo("quIT") == 0)
                break;
            
			if(temp.compareTo("quiT") == 0)
                break;
                
            if(temp.compareTo("quIt") == 0)
                break;
            arr[size++] = temp;
        }

        // outer loop to sort the Ascending array
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < i; j++)
            {
                // compare each element and swap
                if(arr[i].compareTo(arr[j]) < 0)
                {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        // print the result
            System.out.print("\nAscending \n\n");
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + "\n");
            
            
            
            // outer loop to sort the Descending array
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < i; j++)
            {
                // compare each element and swap
                if(arr[i].compareTo(arr[j]) > 0)
                {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        // print the result
            System.out.print("\nDescending \n\n");
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + "\n");
    } 
}