package com.ocmms.cmms.model;

public enum TaskType {

	MEETING("MEETING"), MOC("MOC"), CONCERN("CONCERN"), MANAGEMENT_INSPECTION("MANAGEMENT_INSPECTION"), PM_FINDING(
			"PM_FINDING"), PLANT6S("PLANT6S"), BOSSASIGN("BOSSASIGN"), PHA("PHA"), PSSR("PSSR"), OTHERS("OTHERS");

	public static final TaskType[] ALL = { MEETING, MOC, CONCERN, MANAGEMENT_INSPECTION, PM_FINDING, PLANT6S, BOSSASIGN,
			PHA, PSSR, OTHERS };

	private final String name;

	public static TaskType forName(final String name) {
		if (name == null) {
			throw new IllegalArgumentException("Name cannot be null for TASKTYPE");
		}
		if (name.toUpperCase().equals("MEETING")) {
			return MEETING;
		} else if (name.toUpperCase().equals("MOC")) {
			return MOC;
		} else if (name.toUpperCase().equals("CONCERN")) {
			return CONCERN;
		} else if (name.toUpperCase().equals("MANAGEMENT_INSPECTION")) {
			return MANAGEMENT_INSPECTION;
		} else if (name.toUpperCase().equals("PM_FINDING")) {
			return PM_FINDING;
		} else if (name.toUpperCase().equals("PLANT6S")) {
			return PLANT6S;
		} else if (name.toUpperCase().equals("BOSSASIGN")) {
			return BOSSASIGN;
		} else if (name.toUpperCase().equals("PHA")) {
			return PHA;
		} else if (name.toUpperCase().equals("PSSR")) {
			return PSSR;
		} else if (name.toUpperCase().equals("OTHERS")) {
			return OTHERS;
		}
		throw new IllegalArgumentException("Name \"" + name + "\" does not correspond to any TASKTYPE");
	}

	private TaskType(final String name) {
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
