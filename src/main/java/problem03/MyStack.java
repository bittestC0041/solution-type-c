package problem03;

public class MyStack {
		int top;
		String[] stack;
		int size;
		int  stackpoint;
		static int DEFAULT_STACK_SIZE =  100;
	private String[] buffer;

	public MyStack() {
		this(DEFAULT_STACK_SIZE);
	}
	public MyStack( int size ) {
		stack = new String[size];
		size = size;
		stackpoint=0;
	}
	public void clear() {
		stackpoint = 0;
	}
	private void error(String s) {
		System.err.println(s);
		System.exit(1);
	}
	public void push(String item) {
		if(stackpoint >= size) {
			error("Stack overflow");
		}
		stack[stackpoint++] = item;
	
	}

	public String pop() {
		if(stackpoint <=0) {
			error("Stack underflow");
		}
		
		
		return null;
	}

	public boolean isEmpty() {
		return false;
	}
	
	public int size() {
		return 0;
	}
//	public String toString() {
//		String s ;
//		for(int i = 0 ; i< stackpoint;i++)
//		{
//			
//		}
//	}
}