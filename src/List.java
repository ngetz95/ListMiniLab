import java.util.NoSuchElementException;

/**
 * 
 * A very basic list class.  Elements can only be added at the beginning at
 * the beginning of the list, and can only be removed according to their
 * index.
 * @Author Nathan Sprague
 * @version April 12, 2010
 *
 */
public class List<T> {

	private Node<T> first;
	private int size;
	
	/**
	 * Create an empty list.
	 */
	public List() {
		first = null;
		size = 0;
	}

	/**
	 * Adds a new element AT THE BEGINNING of the list. 
	 * @param element - The element to add
	 */
	public void addElement(T element) 
	{
		//YOU NEED TO ADD CODE HERE!
		Node newAdd = new Node(element);
		newAdd.setNext(first);
		first = newAdd;
		size++;
	}
	
	/**
	 * Removes and returns the element at the specified index. Throws
	 * a noSuchElementException if the index is out of bounds.
	 *  
	 * @param index - position of the element to remove
	 * @return the element that was removed
	 * @throws NoSuchElementException
	 */
	public T removeElement(int index) throws NoSuchElementException
	{
		//YOU NEED TO ADD CODE HERE!
		Node<T> myNode = first;
		Node<T> prev = first;
		Node<T> next;
		if(index < 0 |
				index >= size)
		{
			throw new NoSuchElementException("WRONG");
		}
		
		for(int i = 0; i < index; i++)
		{
			prev = myNode;
			myNode = myNode.getNext();
		}
		next = myNode.getNext();
		prev.setNext(next);
		size--;
		return myNode.getElement();
	}
	
	public void removeFirst()
	{
		removeElement(0);
	}
	
	/**
	 * Returns the number of elements in the list.
	 */
	public int size()
	{
		return size;
	}
	
}
