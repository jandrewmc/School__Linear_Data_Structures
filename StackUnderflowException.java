package Stack;

public class StackUnderflowException extends RuntimeException
{
	static final long serialVersionUID = 1L;
	
	public StackUnderflowException()
	{
		super();
	}
	public StackUnderflowException(String s)
	{
		super(s);
	}
}
