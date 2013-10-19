package abstractSyntaxTree;

public class CondClausesNode extends BinaryNode{
	
	public CondClausesNode(ASTNode leftNode, ASTNode rightNode)
	{
		super(leftNode,rightNode);
	}

	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}
}