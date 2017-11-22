public class LinkedData<T> implements StackInterface<T>{

	private Node node;
	private int index;
	
	private class Node
	{
		T data;
		Node newNode;
	}
	
	public LinkedData()
	{
		node = null;
		index = 0;
	}
	
	@Override
	public void push(T newEntry) {
		Node oldNode = node;
		node = new Node();
		node.data = newEntry;
		node.newNode = oldNode;
		index++;		
	}

	@Override
	public T pop() {
		T newT = node.data;
		node = node.newNode;
		if (index <= 0)
		{
			throw new Error("Empty Stack");
		}
		else 
		{
			index--;
			return newT;
		}
	}

	@Override
	public T peek() {
		if (index > 0)
			return node.data;
		else
			throw new Error("Empty Stack");
		
	}

	@Override
	public boolean isEmpty() {
		return (index <= 0);
	}

	@Override
	public void clear() {
		
		
	}

}
