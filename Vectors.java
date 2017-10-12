import java.util.Vector; //import Vector class

public class Vectors<T> implements StackInterface<T>{
	Vector<T> vectorArray;
	int index = vectorArray.size();		//tracks size of array
	
	public Vectors(){
		
		vectorArray = new Vector<T>();
	}

	@Override
	//checks if the stack is empty
	//adds newEntry to the Vector and increments index
	public void push(T newEntry) {
		// TODO Auto-generated method stub
		if (vectorArray.isEmpty() == false)
		{
			vectorArray.addElement(newEntry);
			index++;
		}
		else 
		{
			throw new Error("Stack full");
		}
	}

	@Override
	//checks if stack is empty
	//decrements index, removes top element and points top at the new top
	public T pop() {
		// TODO Auto-generated method stub
		T top  = null;
		if(index <= 0 )
		{
			throw new Error("Empty Stack");
		}
		else
		{
			index--;
			top = vectorArray.elementAt(index - 1);
			vectorArray.removeElementAt(index);
			return top;
		}
	}

	@Override
	//returns the value at top or throws and error
	public T peek() {
		T top = null;
		if (vectorArray.size() <= 0)
		{
			throw new Error("Empty Stack");
		}
		else
		{
			top = vectorArray.elementAt(index);
			return top;
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (vectorArray.isEmpty());
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		if (index > 0)
		{
			vectorArray.clear();
		}
		else
		{
			throw new Error("Empty Stack");
		}
		
	}

}
