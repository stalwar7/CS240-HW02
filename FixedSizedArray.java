/* Sana Talwar
 * CS 240
 * Homework 2
 */
public class FixedSizedArray<T> implements StackInterface<T>{
	
	private T[] stack;
	private int index = -1;		//tracks # of values in the array
	private int pointer;		//keeps fixed size (initial)
	
	// initializes variables
	public FixedSizedArray(int size)
	{
		stack = (T[]) new Object[size];
		index = size;
		pointer = size;
	}
	
	@Override
	 //checks if Stack is full
	//increments index
    //pushes an element T otherwise
	public void push(T newEntry) {
		if (index >= pointer)
		{
			throw new Error("Stack is full, cannot push more");
		}
		else
		{
			index++;
			stack[index] = (T) newEntry;
		}
	}

	@Override
	//Checks if stack is empty
	//Decrements index
	//returns the value on top
	public T pop() {
		if(index == -1){
			throw new Error ("Empty Stack");
	}
		else{
			index--;
			return stack[index];
	  }
	}
	
	@Override
	//Checks if stack is empty 
	//Else returns value on top
	public T peek() {
		if(index > 0)
			return stack[index];
		else
			throw new Error("Empty Stack");
	}

	@Override
	public boolean isEmpty() {
		return (index == -1);
	}

	@Override
	
	public void clear() {
		if (index == -1)
			throw new Error("Empty Stack");
		else
		{
			for (int i = index; i >0; i++)
			{
				index--;
			}
		}
	}

}
