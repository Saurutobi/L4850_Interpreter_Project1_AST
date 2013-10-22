package abstractSyntaxTree;

import java.util.List;

public class IDListNode extends BinaryNode
{	
	public IDListNode(String id, List<String> ids)
	{
		super(id, ids);
	}
	
	@Override
	public Object accept(Visitor v)
	{
		return null;
	}
}
