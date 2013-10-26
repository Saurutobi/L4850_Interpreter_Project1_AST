package abstractSyntaxTree;

import java.util.List;

import visitors.Visitor;

public class ParamListNode extends BinaryNode
{
	public ParamListNode(ASTNode leftNode, List<ASTNode> extraNodes)
	{
		super(leftNode, extraNodes);
	}

	@Override
	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
	
}
