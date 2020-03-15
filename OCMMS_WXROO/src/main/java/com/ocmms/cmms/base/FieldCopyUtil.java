package com.ocmms.cmms.base;

import java.lang.reflect.Field;

public class FieldCopyUtil {
	public static void setFields(Object from, Object to) {
		Field[] fields = from.getClass().getDeclaredFields();
		for (Field field : fields) {
			try {
				if (!field.equals("id")) {
					Field fieldFrom = from.getClass().getDeclaredField(field.getName());
					Object value = fieldFrom.get(from);
					if (value != null) {
						to.getClass().getDeclaredField(field.getName()).set(to, value);
					}
				}
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
		}
	}
}