package StreamTest;

import java.io.Serializable;

/**
 * Presentation Framework. Presentation Value Object (Cargo) Interface.
 * @author: Architecture Team
 * Creation date: (03/09/2004 4:19:22 PM)
 * Modified by:
 * Modified on:
 * PCR#       :
 */
public interface ICargo extends Serializable {

	String ROWACTION_INSERT = "I";
	String ROWACTION_UPDATE = "U";
	String ROWACTION_DELETE = "D";
	String ROWACTION_SELECT = "S";
	String ROWACTION_RETRO = "R";
	
	/**
	 * Gets the User Info.
	 * Creation date: (03/09/2004 4:19:22 PM)
	 */
	public String getUser();
	
	/**
	 * Sets the User Info.
	 * Creation date: (03/09/2004 4:19:22 PM)
	 */
	public void setUser(String newUser);
	
	/**
	 * Object clone.
	 * Creation date: (03/09/2004 4:19:22 PM)
	 */
	
	public Object clone() throws CloneNotSupportedException;
	
	/**
	 * Primary Key method.
	 *Creation date: (03/09/2004 4:19:22 PM)
	 */
	public IPrimaryKey getPrimaryKey();
	
	/**
	 * Inspect Cargo method.
	 * Creation date: (03/09/2004 4:19:22 PM)
	 */
	public String inspectCargo();
	
	/**
	 * Returns the dirty.
	 * Creation date: (06/18/2004 4:19:22 PM)
	 */
	public boolean isDirty();

	/**
	 * Sets the dirty.
	 * Creation date: (06/18/2004 4:19:22 PM)
	 */
	public void setDirty(boolean dirty);
	
	/**
	 * Resturs the RowAction.
	 * Creation date: (02/28/2005)
	 */	
	public String getRowAction();
}
