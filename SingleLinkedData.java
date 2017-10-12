
public class SingleLinkedData<T> implements QueueInterface<T>{
	private int size;
	private Node front;
	private Node back;
	
	private class Node
	{
		private T newT;
		private Node node;
	}
	public SingleLinkedData() {
		front = null;
		back = null;
		size = 0;
	}

	@Override
	public void enqueue(T newEntry) {
		// TODO Auto-generated method stub
		Node oldNode = back;
		back = new Node();
		back.newT = newT;
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
		// TODO Auto-generated method stub
		if (isEmpty()){
			throw new Error("Empty Queue");
		}
		T newT = front.newT;
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
		// TODO Auto-generated method stub
		return front.newT;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (front ==null && back == null);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
