package StreamTest;

import java.io.Serializable;
/**
 * Abstract Cargo 
 * @author: Architecture Team
 * Creation date: (03/09/2004 4:19:22 PM)
 * Modified by:
 * Modified on:
 * PCR#       :
 * 
 */

public abstract class AbstractCargo
	implements Serializable, Cloneable, ICargo {

	private String user;
	private String cargoName;
	private boolean dirty;
	private String rowAction;
	 
	/**
	 * AbstractCargo is used to represent common behaviors of a ValueObject in the Framework
	 */
	public AbstractCargo() {
		super();
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (03/09/2004 4:19:22 PM)
	 *
	 */
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/**
	 * Insert the method's description here.
	 * Creation date: (03/09/2004 4:19:22 PM)
	 * 
	 */
	public String getUser() {
		return user;
	}

	/**
	 * Insert the method's description here.
	 * Creation date: (03/09/2004 4:19:22 PM)
	 * 
	 */
	public void setUser(String newUser) {
		user = newUser;
	}
	/**
	 * Insert the method's description here.
	 * Creation date: (03/09/2004 4:19:22 PM)
	 * 
	 */
	public String getCargoName() {
		return cargoName;
	}	
	/**
	 * Insert the method's description here.
	 * Creation date: (03/09/2004 4:19:22 PM)
	 * 
	 */
	public void setCargoName(String cName) {
		cargoName = cName;
	}

	/**
	 * Returns the dirty.
	 * Creation date: (03/09/2004 4:19:22 PM)
	 */
	public boolean isDirty() {
		return dirty;
	}

	/**
	 * Sets the dirty.
	 * Creation date: (03/09/2004 4:19:22 PM)
	 */
	public void setDirty(boolean dirty) {
		this.dirty = dirty;
	}
	
	public String getDelete_reason_cd() {
		return null;
	}
	/**
	 * @return
	 */
	public String getRowAction() {
		return rowAction;
	}

	/**
	 * @param string
	 */
	public void setRowAction(String string) {
		rowAction = string;
	}
}
