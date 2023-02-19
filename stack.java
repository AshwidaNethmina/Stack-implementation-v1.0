import java.util.Scanner;

public class stack
{
	static int top=-1;
	static int size;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the stack: ");
		size = sc.nextInt();
		int array[] = new int[size];
		
		push(5, array);		//5
		peek(array);
		push(7, array);		//5 7
		peek(array);
		push(8, array);		//5 7 8
		peek(array);
		push(1, array);		//5 7 8 1
		peek(array);
		pop(array);			//5 7 8
		peek(array);		
	}
	
	public static boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isFull()
	{
		if(top == size-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void push(int element, int stack[])
	{
		if(!isFull())
		{
			top++;
			stack[top] = element;
			System.out.println(stack[top]+" is pushed");
		}
		else
		{
			System.out.println("The stack is full");
		}
	}
	
	public static void pop(int stack[])
	{
		if(!isEmpty())
		{
			
			System.out.println(stack[top]+" is popped");
			top--;
		}
		else
		{
			System.out.println("The stack is empty");
		}
	}
	
	public static void peek(int stack[])
	{
		if(!isEmpty())
		{
			System.out.println("Peek is: "+stack[top]);
		}
		else
		{
			System.out.println("The stack is empty");
		}
	}
}