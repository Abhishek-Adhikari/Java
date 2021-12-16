class Stack {
	
	String arr [];
	int size, top;
	
	public Stack(int size) {
		this.size = size;
		top = 0;
		arr = new String [size];
	}
	
	void push(String name) {
		if (top != size) {
			arr[top] = name;
			top++;
		}
		else {
			System.out.println("stack is full");
		}
	}	
	
	void display() {
		for (int i = top-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	String pop() {
		if (top != 0) {
			top--;
			return arr[top];
		}
		return null;
	}	
}