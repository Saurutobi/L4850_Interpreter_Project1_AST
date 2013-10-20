package abstractSyntaxTree;

public class VarRefNode implements ASTNode
{
	private String leftString;
	private String rightString;
	
	public VarRefNode(String leftString, String rightString)
	{
		this.leftString = leftString;
		this.rightString = rightString;
	}
	
	public String getLeftString()
	{
		return leftString;
	}
	
	public String getRightString()
	{
		return rightString;
	}
	
	@Override
	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}

