import java.util.*;
class stack
{
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("bootom");
		printStack(st);
		st.push("second");
		printStack(st);
		st.push("third");
		printStack(st);

		st.pop();
		printStack(st);
		st.pop();
		printStack(st);
		st.pop();
		printStack(st);
		
	}
	private static void printStack(Stack<String> st)
	{
		if(st.isEmpty()){
			System.out.println("Empty stack!");
		}
		else
			System.out.printf("Stack : %s\n",st );
	}
}