public class FixedSizedArrayQueue<T> implements QueueInterface<T>{
	private int front;
	private int back;
	private int size;
	T[] queue;
	
	public FixedSizedArrayQueue(int currentSize)
	{
		size = currentSize;
		queue = (T[]) new Object[size];
		front = -1;
		back = -1;
		
	}
	@Override
	public void enqueue(T newEntry) {
		if (isEmpty())
		{
			front++;
			back++;
			queue[back] = newEntry;
		}
		else if ((back+1)%size == front)
		{
			throw new Error("Full Queue");
		}
		else
		{
			back = (back+1)%size;
			queue[back] = newEntry;
		}
	}

	@Override
	public T dequeue() {
		T secondPlace = null;
		if (front != back)
		{
			secondPlace = queue[front];
			front = (front + 1) % size;
		}
		else if (front == back)
		{
			secondPlace = queue[front];
			front = -1;
			back = -1;
		}
		else
			throw new Error("Empty Queue");
		return secondPlace;
	}

	@Override
	public T getFront() {
		return queue[front];
	}

	@Override
	public boolean isEmpty() {
		if (front < 0 && back <0)
			return true;
		else
			return false;
	}

	@Override
	public void clear() {
		if(isEmpty())
			throw new Error("Empty Queue");
		else
		{
			for(int i = size; i > 0; i--)
			{
				size--;
			}
		}
		
	}

}
