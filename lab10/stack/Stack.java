package stack;

import java.util.List;

<<<<<<< HEAD
public interface Stack <T>{
=======
public interface Stack {
>>>>>>> 4dfe8c086ef959e6de70473f86469406eb465734

	/**
	 * Adds the item on top of the stack.
	 * @param item
	 */
<<<<<<< HEAD
	public void push(T item);
=======
	public void push(Object item);
>>>>>>> 4dfe8c086ef959e6de70473f86469406eb465734
	
	/**
	 *  Removes and returns the item from the top of the stack
	 * @return the item removed from the top
	 */
<<<<<<< HEAD
	public T pop ();
=======
	public Object pop ();
>>>>>>> 4dfe8c086ef959e6de70473f86469406eb465734
	
	/**
	 * Returns true if stack does not contain any item
	 * @return
	 */
	public boolean empty();
<<<<<<< HEAD

	public List<T> toList();


	
=======
>>>>>>> 4dfe8c086ef959e6de70473f86469406eb465734
	

}