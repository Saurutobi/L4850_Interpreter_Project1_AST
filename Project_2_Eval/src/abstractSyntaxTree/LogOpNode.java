package abstractSyntaxTree;

import visitors.Visitor;

public class LogOpNode extends UnaryNode
{
	public LogOpNode(String symbol)
	{
		super(symbol);
	}

	@Override
	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
