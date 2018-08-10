package com.queue.twostacks;


import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

class queue {
	
	Stack<Integer> firststack;
	Stack<Integer> secondstack;
	
	//constructor
	public queue() {
	 
		firststack = new Stack<Integer>();
		secondstack = new Stack<Integer>();
		}
	
	//insert elements into queue.
	
	public void insert(int data) {
		
		if(firststack.size() == 0) {
			firststack.push(data);
		}
		else {
			//pushing all elements to 
			//sencond stack if any??
			
			int i = firststack.size();
			for(int j = 0; j<1; j++)
				secondstack.push(firststack.pop());
			
			//pushing new elements two firts stack
			firststack.push(data);
			
			for(int j = 0; j<1; j++)
				firststack.push(secondstack.pop());
		}
	}
	
	  
	 /* function to remove first elements from queue..
	 */ 			
	
	
	public int remove()
	{
		if(firststack.size()== 0) 
			
			throw new NoSuchElementException("underflow exception");
			return firststack.pop();
		
	}

  /*check the first elements in the queue..
  */
 
	
	public int peek() {
         if(firststack.size()== 0) 
			
			throw new NoSuchElementException("underflow exception");
			return firststack.peek();
		
	}
	
	/*chceking if queue is empty
	*/
	public boolean isEmpty() {
		return firststack.size()==0;
	}
	
/*	size of the queue
*/	
	public int getSize() {
		return firststack.size();
		
	}
	
/*	displaying status of quque*/
	 public void display()
	    {
	        System.out.print("\nQueue = ");
	        int k = getSize();
	        if (k == 0)
	            System.out.print("Empty\n");
	        else
	        {
	            /* Iterator wont return for stack in order            */ 
	            for (int i = k - 1; i >= 0; i--)
	                System.out.print(firststack.get(i)+" ");                
	            System.out.println();
	        }
	    }
	
}



public class QueueImplTwoStacks {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		queue q = new queue();
		
		
		 /* Perform Queue Operations */            
        System.out.println("Queue Using Two Stacks Test\n"); 
        char ch;         
        do
        {
            System.out.println("\nQueue Operations");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");            
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                q.insert( scan.nextInt() );                 
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Removed Element = "+ q.remove() );
                }
                catch (Exception e) 
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    System.out.println("Peek Element = "+ q.peek() );
                }
                catch (Exception e) 
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                          
            case 4 : 
                System.out.println("Empty status = "+ q.isEmpty() );
                break;                
            case 5 : 
                System.out.println("Size = "+ q.getSize() );
                break;                          
            default : 
                System.out.println("Wrong Entry \n ");
                break;    
            }                
            /* Display Queue */        
            q.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');                                                            
    

}
}
