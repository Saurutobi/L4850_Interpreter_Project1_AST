package abstractSyntaxTree;

import Visitors.Visitor;

public class IDNode implements ASTNode
{
	private String Token;
	
	public IDNode(String name)
	{
		Token = name;
	}
	
	public String getToken()
	{
		return Token;
	}

	@Override
	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}