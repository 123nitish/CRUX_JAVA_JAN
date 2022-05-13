package lec35;

public class stack {

	private int[]data;
	private int top=0;
	public stack() {
		this.data=new int[5];
	}
	public stack( int cap) {
		this.data=new int [cap];
	}
	public boolean IsEmpty() {
		return this.top==this.data.length;
	}
public void push(int item) {
	this.data[this.top]=item;
	this.top++;
}
public int pop() {
	this.top--;
	return this.data[top];
}
public int peek() {
	return this.data[this.top-1];
}
public int size() {
return this.top	;
}
public void display() {
	for(int i=0;i<top;i++) {
		System.out.println(this.data[i]+" ");
	}
}
//System.out.println();
}
