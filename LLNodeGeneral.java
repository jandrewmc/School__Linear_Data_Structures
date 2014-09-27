package LinkedList;

public class LLNodeGeneral<T> implements LLNode<T>
{
	private T info;
	private LLNode<T> link;
	
	public LLNodeGeneral(T info)
	{
		this.info = info;
	}
	
	public void setLink(LLNode<T> link)
	{
		this.link = link;
	}
	public void setInfo(T info)
	{
		this.info = info;
	}
	public LLNode<T> getLink()
	{
		return link;
	}
	public T getInfo()
	{
		return info;
	}
}