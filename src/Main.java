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

	System.out.println(stack.pop());	
    }
}
