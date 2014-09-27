package Stack;
import LinkedList.*;

public class UnboundedStackLLImplementation<T> implements StackInterface<T>
{
	private T currentInfo = null;
	LLNodeGeneral<T> link = null;
	LLNodeGeneral<T> list = null;
	
	public UnboundedStackLLImplementation(){}
	
	public void push(T info)
	{
		LLNodeGeneral<T> node = new LLNodeGeneral<T>(info);

		if(list == null)
		{
			list = node;
		}
		else
		{
			node.setLink(list);
			list = node;
		}
	}
	public void pop()
	{
		if(!isEmpty())
		{
			currentInfo = list.getInfo();
			list = (LLNodeGeneral<T>) list.getLink();
		}
		else 
			throw new StackUnderflowException("Pop attempted on an empty stack!");
	}
	public T top()
	{
		if(!isEmpty())
		{
		currentInfo = list.getInfo();
		return currentInfo;
		}
		else
			throw new StackUnderflowException("Top attempted on an empty stack!");
	}
	public boolean isFull()
	{
		return false;
	}
	public boolean isEmpty()
	{
		if(list == null) return true;
		else return false;
	}
}
