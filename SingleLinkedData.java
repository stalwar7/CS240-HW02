
public class SingleLinkedData<T> implements QueueInterface<T>{
	private int size;
	private Node front;
	private Node back;
	
	private class Node
	{
		private T data;
		private Node node;
	}
	public SingleLinkedData() {
		front = null;
		back = null;
		size = 0;
	}

	@Override
	public void enqueue(T newEntry) {
		back = new Node();
		//back.newT = node.newT;
		back.node = null;
		if (isEmpty())
		{
				front = back;
		}
		else
		{
			size++;
		}
	}

	@Override
	public T dequeue() {
		if (isEmpty()){
			throw new Error("Empty Queue");
		}
		T newT = front.data;
		front = front.node;
		size--;
		if(isEmpty())
		{
			back = null;
		}
		return newT;
	}

	@Override
	public T getFront() {
		return front.data;
	}

	@Override
	public boolean isEmpty() {
		return (size == -1);
	}

	@Override
	public void clear() {
		while(!isEmpty())
		{
			Node temp = front.node;
			front = null;
			front = temp;
			
		}
		
	}

}
