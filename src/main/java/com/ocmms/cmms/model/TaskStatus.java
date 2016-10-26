package com.ocmms.cmms.model;

public enum TaskStatus {

	NOSTART("NOSTART"), 
	ONGOING("ONGOING"), 
	DELAY("DELAY"), 
	COMPLETED("COMPLETED"), 
	PENGDING("PENGDING"), 
	CANCEL("CANCEL");

	public static final TaskStatus[] ALL = { NOSTART, 
			ONGOING, 
			DELAY, 
			COMPLETED, 
			PENGDING, 
			CANCEL};

	private final String name;

	public static TaskStatus forName(final String name) {
		if (name == null) {
			throw new IllegalArgumentException("Name cannot be null for TASKSTATUS");
		}
		if (name.toUpperCase().equals("NOSTART")) {
			return NOSTART;
		} else if (name.toUpperCase().equals("ONGOING")) {
			return ONGOING;
		} else if (name.toUpperCase().equals("DELAY")) {
			return DELAY;
		} else if (name.toUpperCase().equals("COMPLETED")) {
			return COMPLETED;
		} else if (name.toUpperCase().equals("PENGDING")) {
			return PENGDING;
		} else if (name.toUpperCase().equals("CANCEL")) {
			return CANCEL;
		} 
		throw new IllegalArgumentException("Name \"" + name + "\" does not correspond to any TASKSTATUS");
	}

	private TaskStatus(final String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return getName();
	}

}
