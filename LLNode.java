package LinkedList;

public interface LLNode<T> 
{
	public T getInfo();
	public LLNode<T> getLink();
	public void setInfo(T info);
	public void setLink(LLNode<T> link);
}
