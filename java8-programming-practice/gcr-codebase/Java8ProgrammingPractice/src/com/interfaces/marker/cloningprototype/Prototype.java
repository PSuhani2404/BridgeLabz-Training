package com.interfaces.marker.cloningprototype;

public interface Prototype  extends Cloneable
{

	// Custom marker interface
	// Just extends Cloneable to group cloneable objects
	    // no methods – pure marker
	    Object clone() throws CloneNotSupportedException;
}
