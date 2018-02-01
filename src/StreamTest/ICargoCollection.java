package StreamTest;


import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Enter the description of the class 
 * @author Umesh
 * Creation Date Aug 06, 2007
 * Modified By:
 * Modified on: 
 * PCR#
 */
public interface ICargoCollection extends Collection, Serializable {
	
	void setGenericResults(Object obj)  throws java.rmi.RemoteException;        
	String getPACKAGE();        
	
	/**
	 * Ensures that this collection contains the specified element (optional
	 * operation).  Returns <tt>true</tt> if this collection changed as a
	 * result of the call.  (Returns <tt>false</tt> if this collection does
	 * not permit duplicates and already contains the specified element.)<p>
	 */
	boolean add(Object o);

	/**
	 * Adds all of the elements in the specified collection to this collection
	 * (optional operation).  The behavior of this operation is undefined if
	 * the specified collection is modified while the operation is in progress.
	 * (This implies that the behavior of this call is undefined if the
	 * specified collection is this collection, and this collection is
	 * nonempty.)
	 */
	boolean addAll(Collection c);
	
	/**
	 * Removes all of the elements from this collection (optional operation).
	 * This collection will be empty after this method returns unless it
	 * throws an exception.
	 */
	void clear();
	
	/**
	 * Returns <tt>true</tt> if this collection contains the specified
	 * element.  More formally, returns <tt>true</tt> if and only if this
	 * collection contains at least one element <tt>e</tt> such that
	 * <tt>(o==null ? e==null : o.equals(e))</tt>.
	 */
	boolean contains(Object o);
	
	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements
	 * in the specified collection.
	 *
	 */
	boolean containsAll(Collection c);
	
	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 */
	boolean isEmpty();

	/**
	 * Returns an iterator over the elements in this collection.  There are no
	 * guarantees concerning the order in which the elements are returned
	 * (unless this collection is an instance of some class that provides a
	 * guarantee).
	 */
	java.util.Iterator iterator();

	/**
	 * Removes a single instance of the specified element from this
	 * collection, if it is present (optional operation).  More formally,
	 * removes an element <tt>e</tt> such that <tt>(o==null ?  e==null :
	 * o.equals(e))</tt>, if this collection contains one or more such
	 * elements.  Returns true if this collection contained the specified
	 * element (or equivalently, if this collection changed as a result of the
	 * call).
	 */
	boolean remove(Object o);

	/**
	 *
	 * Removes all this collection's elements that are also contained in the
	 * specified collection (optional operation).  After this call returns,
	 * this collection will contain no elements in common with the specified
	 * collection.
	 */
	boolean removeAll(Collection c);

	/**
	 * Retains only the elements in this collection that are contained in the
	 * specified collection (optional operation).  In other words, removes from
	 * this collection all of its elements that are not contained in the
	 * specified collection.
	 *
	 */
	boolean retainAll(Collection c);
    
	/**
	 * Returns the number of elements in this collection.  If this collection
	 * contains more than <tt>Integer.MAX_VALUE</tt> elements, returns
	 * <tt>Integer.MAX_VALUE</tt>.
	 *
	 */
	int size();

	/**
	 * Returns an array containing all of the elements in this collection.  If
	 * the collection makes any guarantees as to what order its elements are
	 * returned by its iterator, this method must return the elements in the
	 * same order.<p>
	 */
	Object[] toArray();

	/**
	 * Returns an array containing all of the elements in this collection
	 * whose runtime type is that of the specified array.  If the collection
	 * fits in the specified array, it is returned therein.  Otherwise, a new
	 * array is allocated with the runtime type of the specified array and the
	 * size of this collection.<p>
	 *
	 */
	Object[] toArray(Object[] a);

	/**
	 * Gets the currentIndex
	 * @return Returns a int
	 */
	int getCurrentIndex();

	/**
	 * Sets the currentIndex
	 * @param currentIndex The currentIndex to set
	 */
	void setCurrentIndex(int currentIndex);

	/**
	 * gets the object for a given index
	 * @return object
	 */
	Object get(int idx);
	
	/**
	 * Insert the method's description here.
	 * Creation date: (11/7/2001 6:23:47 PM)
	 */
	Collection getKeys();
	
	/**
	 * Insert the method's description here.
	 * Creation date: (11/7/2001 6:23:47 PM)
	 */
	int getSelectSize();

	/**
	 * Insert the method's description here.
	 * Creation date: (11/7/2001 6:23:47 PM)
	 */
	void release() throws Throwable ;

	/**
	 * Removes a single instance of the specified element from this
	 * collection, if it is present (optional operation).  More formally,
	 * removes an element <tt>e</tt> such that <tt>(o==null ?  e==null :
	 * o.equals(e))</tt>, if this collection contains one or more such
	 * elements.  Returns true if this collection contained the specified
	 * element (or equivalently, if this collection changed as a result of the
	 * call).
	 */
	Object remove(int index);
	
	/**
	 * set the obj to the given index
	 */
	void set(int idx, Object obj);

	void setSelectSize(int size);

	/**
	 * get the obj for the given index
	 */
	Object find(Object o);
	
	/**
	 * persist method. Pass the peristent type and instet/update args as a Map
	 * @param aPersist_type java.lang.String
	 */
	Collection persist(String aPersist_type) throws Exception;

	/**
	 * persist method. Pass the peristent type and instet/update args as a Map
	 * @param aPersist_type java.lang.String
	 */
	Collection persist(String aPersist_type, String aUpdateMethod) throws Exception;

	Collection delete(String aPersist_type) throws Exception ;
    
	/**
	 * select method. Pass the persistent type and select criteria in a Map
	 * @param aPersist_type java.lang.String
	 * @param aData java.util.Map
	 */    
	ICargo[] select(String aPersist_type, Map aData) throws Exception ;

	ICargo[] select(String aPersist_type, String aFinderMethod) throws Exception;

	/**
	 * calls the given persistence type and returns the result as a List 
	 */
	List execute(String aPersistType, String aMethodName) throws Exception ;

	List getNext(int count) throws Exception;

	List getPrevious(int count) throws Exception;
	
	List getFirst(int count) throws Exception;
	

	List getLast(int count) throws Exception;

}
