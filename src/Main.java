import basic.List;
import basic.Stack;

public class Main {

    public static void main(String[] args) {
	runStack();
    }
    
    private static void runStack() {
	// LIFO stack
	Stack<Integer> stack = new Stack<Integer>();
	stack.push(2);
	stack.push(4);
	stack.push(5);

//	System.out.println(stack.pop());	
	
	List<Integer> list = new List<Integer>();
	list.add(10);
	list.set(1, 200);
	System.out.println(list.get(1));
	System.out.println(list.get(0));
    }
}
