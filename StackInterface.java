 package Stack;

public interface StackInterface<T>
{
	public void push(T info);
	public void pop();
	public T top();
	public boolean isFull() throws StackOverflowException;
	public boolean isEmpty() throws StackUnderflowException;
}