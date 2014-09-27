package Stack;

public class StackOverflowException extends RuntimeException
{
	static final long serialVersionUID = 1L;
	
	public StackOverflowException()
	{
		super();
	}
	public StackOverflowException(String s)
	{
		super(s);
	}
}
