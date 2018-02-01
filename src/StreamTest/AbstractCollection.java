package StreamTest;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Presentation Framework.
 * @author: Architecture Team
 * Creation date: (03/09/2004 4:19:22 PM)
 * Modified by:
 * Modified on:
 * PCR#       :
 */
public abstract class AbstractCollection implements ICargoCollection {

    ArrayList list = new ArrayList();
    ArrayList keys = new ArrayList();
    private int selectSize = 100;
	private int currentIndex;
	private Object ejbFacadeRef;

   	public abstract void setGenericResults(Object obj)  throws java.rmi.RemoteException;
    public abstract String getPACKAGE();


	/**
	 * AbstractCargo constructor comment.
	 * Creation date: (03/09/2004 4:19:22 PM)
	 */
    public AbstractCollection() {
    }

	/**
	 * Ensures that this collection contains the specified element (optional
	 * operation).  Returns <tt>true</tt> if this collection changed as a
	 * result of the call.  (Returns <tt>false</tt> if this collection does
	 * not permit duplicates and already contains the specified element.)<p>

	 * @param o element whose presence in this collection is to be ensured.
	 * @return <tt>true</tt> if this collection changed as a result of the
	 *         call
	 *
	 * @throws UnsupportedOperationException add is not supported by this
	 *         collection.
	 * @throws ClassCastException class of the specified element prevents it
	 *         from being added to this collection.
	 * @throws IllegalArgumentException some aspect of this element prevents
	 *          it from being added to this collection.
	 */
    public boolean add(Object o) {
        return list.add(o);
    }

    public void addAt(Object o,int i) {
    	list.add(i, o);
    }

	/**
	 * Adds all of the elements in the specified collection to this collection
	 * (optional operation).  The behavior of this operation is undefined if
	 * the specified collection is modified while the operation is in progress.
	 * (This implies that the behavior of this call is undefined if the
	 * specified collection is this collection, and this collection is
	 * nonempty.)
	 *
	 * @param c elements to be inserted into this collection.
	 * @return <tt>true</tt> if this collection changed as a result of the
	 *         call
	 *
	 * @throws UnsupportedOperationException if this collection does not
	 *         support the <tt>addAll</tt> method.
	 * @throws ClassCastException if the class of an element of the specified
	 * 	       collection prevents it from being added to this collection.
	 * @throws IllegalArgumentException some aspect of an element of the
	 *	       specified collection prevents it from being added to this
	 *	       collection.
	 *
	 * @see #add(Object)
	 */
    public boolean addAll(Collection c) {
        return list.addAll(c);
    }

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * This collection will be empty after this method returns unless it
	 * throws an exception.
	 *
	 * @throws UnsupportedOperationException if the <tt>clear</tt> method is
	 *         not supported by this collection.
	 */
    public void clear() {
        list.clear();
    }

	/**
	 * Returns <tt>true</tt> if this collection contains the specified
	 * element.  More formally, returns <tt>true</tt> if and only if this
	 * collection contains at least one element <tt>e</tt> such that
	 * <tt>(o==null ? e==null : o.equals(e))</tt>.
	 *
	 * @param o element whose presence in this collection is to be tested.
	 * @return <tt>true</tt> if this collection contains the specified
	 *         element
	 */
    public boolean contains(Object o) {
        return list.contains(o);
    }

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements
	 * in the specified collection.
	 *
	 * @param c collection to be checked for containment in this collection.
	 * @return <tt>true</tt> if this collection contains all of the elements
	 *	       in the specified collection
	 * @see #contains(Object)
	 */
    public boolean containsAll(Collection c) {
        return list.containsAll(c);
    }

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 *
	 * @returns <tt>true</tt> if this collection contains no elements
	 */
    public boolean isEmpty() {
        return list.isEmpty();
    }

	/**
	 * Returns an iterator over the elements in this collection.  There are no
	 * guarantees concerning the order in which the elements are returned
	 * (unless this collection is an instance of some class that provides a
	 * guarantee).
	 *
	 * @returns an <tt>Iterator</tt> over the elements in this collection
	 */
    public java.util.Iterator iterator() {
        return list.iterator();
    }

	/**
	 * Removes a single instance of the specified element from this
	 * collection, if it is present (optional operation).  More formally,
	 * removes an element <tt>e</tt> such that <tt>(o==null ?  e==null :
	 * o.equals(e))</tt>, if this collection contains one or more such
	 * elements.  Returns true if this collection contained the specified
	 * element (or equivalently, if this collection changed as a result of the
	 * call).
	 *
	 * @param o element to be removed from this collection, if present.
	 * @return <tt>true</tt> if this collection changed as a result of the
	 *         call
	 *
	 * @throws UnsupportedOperationException remove is not supported by this
	 *         collection.
	 */
    public boolean remove(Object o) {
        return list.remove(o);
    }

	/**
	 *
	 * Removes all this collection's elements that are also contained in the
	 * specified collection (optional operation).  After this call returns,
	 * this collection will contain no elements in common with the specified
	 * collection.
	 *
	 * @param c elements to be removed from this collection.
	 * @return <tt>true</tt> if this collection changed as a result of the
	 *         call
	 *
	 *
	 * @throws UnsupportedOperationException if the <tt>removeAll</tt> method
	 * 	       is not supported by this collection.
	 *
	 * @see #remove(Object)
	 * @see #contains(Object)
	 */
    public boolean removeAll(Collection c) {
        return list.removeAll(c);
    }

	/**
	 * Retains only the elements in this collection that are contained in the
	 * specified collection (optional operation).  In other words, removes from
	 * this collection all of its elements that are not contained in the
	 * specified collection.
	 *
	 * @param c elements to be retained in this collection.
	 * @return <tt>true</tt> if this collection changed as a result of the
	 *         call
	 *
	 * @throws UnsupportedOperationException if the <tt>retainAll</tt> method
	 * 	       is not supported by this Collection.
	 *
	 * @see #remove(Object)
	 * @see #contains(Object)
	 */
    public boolean retainAll(Collection c) {
        return retainAll(c);
    }

	/**
	 * Returns the number of elements in this collection.  If this collection
	 * contains more than <tt>Integer.MAX_VALUE</tt> elements, returns
	 * <tt>Integer.MAX_VALUE</tt>.
	 *
	 * @return the number of elements in this collection
	 */
    public int size() {
        return list.size();
    }

	/**
	 * Returns an array containing all of the elements in this collection.  If
	 * the collection makes any guarantees as to what order its elements are
	 * returned by its iterator, this method must return the elements in the
	 * same order.<p>
	 *
	 * This method acts as bridge between array-based and collection-based
	 * APIs.
	 *
	 * @return an array containing all of the elements in this collection
	 */

    public Object[] toArray() {
        return list.toArray();
    }

	public Object[] toArray(Object[] a) {
        return list.toArray(a);
    }
	/**
	 * Gets the currentIndex
	 * @return Returns a int
	 */
	public int getCurrentIndex() {
		return currentIndex;
	}
	/**
	 * Sets the currentIndex
	 * @param currentIndex The currentIndex to set
	 */
	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}
	/**
	 * gets the object for a given index
	 * @return object
	 */
    public Object get(int idx) {
        return list.get(idx);
    }
	/**
	 * Insert the method's description here.
	 * Creation date: (11/7/2001 6:23:47 PM)
	 */
    public Collection getKeys() {
        return keys;
    }
	/**
	 * Insert the method's description here.
	 * Creation date: (11/7/2001 6:23:47 PM)
	 */
    public int getSelectSize() {
        return selectSize;
    }

	/**
	 * Insert the method's description here.
	 * Creation date: (11/7/2001 6:23:47 PM)
	 */
    public void release() throws Throwable {
        finalize();
    }

	public Object remove(int index) {
        return list.remove(index);
    }

	/**
	 * set the obj to the given index
	 */
    public void set(int idx, Object obj) {
        list.set(idx, obj);
    }

    public void setSelectSize(int size) {
        selectSize = size;
    }

	/**
	 * get the obj for the given index
	 */
    public Object find(Object o) {
        int idx = list.indexOf(o);

        if (idx == -1){
            return null;}
        else{
            return (list.get(idx));}
    }

	/**
	 * persist method. Pass the peristent type and instet/update args as a Map
	 * @param aPersist_type java.lang.String
	 */
	public Collection persist(String aPersist_type) throws Exception {

		// get the IData using service factory
		return null;
	}

	/**
	 * persist method. Pass the peristent type and instet/update args as a Map
	 * @param aPersist_type java.lang.String
	 */
	public Collection persist(String aPersist_type, String aUpdateMethod) throws Exception {

		return null;
	}

	/**
	 * persist method. Pass the peristent type and instet/update args as a Map
	 * @param aPersist_type java.lang.String
	 */
	public Collection persistWithConnection(String aPersist_type, String aUpdateMethod,Connection conn) throws Exception {

		// get the IData using service factory
		return null;
	}



	public Collection delete(String aPersist_type) throws Exception {

		// get the IData using service factory
		return null;
	}

    /**
     * select method. Pass the persistent type and select criteria in a Map
     * @param aPersist_type java.lang.String
     * @param aData java.util.Map
     */
    public ICargo[] select(String aPersist_type, Map aData) throws Exception {

    	// get the IData using service factory
    	return null;
    }


	public ICargo[] select(String aPersist_type, String aFinderMethod) throws Exception {

		// get the IData using service factory
		return null;
	}

	/**
	 * calls the given persistence type and returns the result as a List
	 */
	public List execute(String aPersistType, String aMethodName) throws Exception {


		return null;
	}

	/**
	 * persist method. Pass the peristent type and instet/update args as a Map
	 * @param aPersist_type java.lang.String
	 */
	public Collection persistBatch(String aPersist_type) throws Exception {

		// get the IDataBatch using service factory
		return null;
	}

	/**
	 * persist method. Pass the peristent type and instet/update args as a Map
	 * @param aPersist_type java.lang.String
	 */
	public Collection persistBatch(String aPersist_type, String aUpdateMethod) throws Exception {

		// get the IDataBatch using service factory
		return null;
	}

	/**
	 * select method. Pass the persistent type and select criteria in a Map
	 * @param aPersist_type java.lang.String
	 * @param aData java.util.Map
	 */
	public ICargo[] selectBatch(String aPersist_type, Map aData) throws Exception {

		// get the IDataBatch using service factory
		return null;
	}

	public ICargo[] selectBatch(String aPersist_type, String aFinderMethod) throws Exception {

		return null;
	}

	/**
	 * calls the given persistence type and returns the result as a List
	 */
	public List executeBatch(String aPersistType, String aMethodName) throws Exception {

		// get the IDataBatch using service factory
		return null;
	}

	/**
	 * sends message to given queue with the given values.
	 */
	public void sendMessage() {

	}


	public List getNext(int count) throws Exception {
		List subList = new ArrayList();
		int fromIndex = 0;
		int toIndex = 0;
		try{
			// if list is empty
			if (list != null && list.isEmpty()){ return subList;}
			// if rows retrieved is less than count
			if (list!=null && list.size() < count) {
				toIndex = list.size();
			}else{
				// if end of list is reached
				if (list !=null && currentIndex >= list.size()){ return subList;}
				fromIndex	= currentIndex + count;
				// check for request count and list size
				if (list != null && count > list.size()) {
					toIndex = list.size();
				}else{
					toIndex 		= fromIndex + count;
				}
				if (list != null ) {if (fromIndex >= list.size()){ fromIndex  = currentIndex;}	}
				if (list != null ) {if (toIndex >= list.size()){ toIndex = list.size();}	}
			}
			if (list!= null) {
				subList = list.subList(fromIndex, toIndex);
			}
			currentIndex =  fromIndex;
		}catch(IndexOutOfBoundsException ie){
			Exception fe = new Exception();
			throw fe;
		}catch(Exception e){
			Exception fe = new Exception();
			throw fe;
		}
		return subList;
	}

	public List getPrevious(int count) throws Exception {
		List subList = new ArrayList();
		int fromIndex = 0;
		int toIndex = 0;
		try{
			if (list != null && list.isEmpty()){ return subList;}

			// if rows retrieved is less than count
			if (list != null && list.size() < count) {
				toIndex = list.size();
			}else{
				if (currentIndex <=0) {
					fromIndex = 0;
				}else{
					fromIndex = currentIndex - count;
				}
				toIndex 	   = fromIndex + count;
				if (toIndex < 0){ toIndex = 0;}
				if (fromIndex < 0){ 	fromIndex = 0;}
				if (fromIndex == 0 && toIndex == 0){ return subList;}
				currentIndex = fromIndex;
			}
			if(null != list){
				subList = list.subList(fromIndex, toIndex);
			}
			else{
				subList = new ArrayList();
			}
		}catch(IndexOutOfBoundsException ie){
			Exception fe = new Exception();
			throw fe;
		}catch(Exception e){
			Exception fe = new Exception();
			throw fe;
		}
		return subList;
	}

	public List getFirst(int count) throws Exception {
		List subList = new ArrayList();
		int fromIndex = 0;
		int toIndex = 0;
		try{
			// if list is empty
			if (list != null && list.isEmpty()){ return subList;}
			// if list's size is less than count
			if (list != null && list.size() < count) {
				toIndex = list.size();
			}else{
				toIndex = count;
			}
			if (list !=null) {
				subList = list.subList(fromIndex, toIndex);
			}
			currentIndex = 0;
		}catch(IndexOutOfBoundsException ie){
			Exception fe = new Exception();
			throw fe;
		}catch(Exception e){
			Exception fe = new Exception();
			throw fe;
		}
		return subList;
	}


	public List getLast(int count) throws Exception {
		List subList = new ArrayList();
		int fromIndex  = 0;
		int toIndex = 0;
		try{
			if (list != null && list.isEmpty()){
				return subList;
			}
			if (list != null){

				toIndex = list.size();

			}
			if (list !=null && list.size() < count) {
				fromIndex = 0;
			}else{
				if (list != null) {
					fromIndex = list.size() - count;
				}
			}
			if(null != list){
				subList = list.subList(fromIndex, toIndex);
				currentIndex = list.size() - count;
			}
			else{
				subList = new ArrayList();
			}


		}catch(IndexOutOfBoundsException ie){
			Exception fe = new Exception();
			throw fe;
		}catch(Exception e){
			Exception fe = new Exception();
			throw fe;
		}
		return  subList;
	}
	/**
	 * @return the ejbFacadeRef
	 */
	public Object getEjbFacadeRef() {
		return ejbFacadeRef;
	}
	/**
	 * @param ejbFacadeRef the ejbFacadeRef to set
	 */
	public void setEjbFacadeRef(Object ejbFacadeRef) {
		this.ejbFacadeRef = ejbFacadeRef;
	}
}