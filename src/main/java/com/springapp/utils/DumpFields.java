package com.springapp.utils;

import java.lang.reflect.*;
import java.util.ArrayList;

import com.springapp.models.base.EntityBase;

public class DumpFields {
	public static <T> ArrayList<String> inspect(Class<T> klazz) {
		ArrayList<String> attributs = new ArrayList<String>();
		Field[] fields;
		Class superClass = klazz;

		fields = superClass.getDeclaredFields();
		for (Field field : fields) {
			attributs.add(field.getName());
		}

		while (superClass.getSuperclass() != EntityBase.class
				&& superClass.getSuperclass() != Object.class) {
			superClass = superClass.getSuperclass();
			fields = superClass.getDeclaredFields();
			for (int i = fields.length - 1; i >= 0; i--) {
				attributs.add(0, fields[i].getName());
			}
		}

		return attributs;
	}

	public static <T> T createContents(Integer id, Class<T> clazz)
    {
        try {
			return clazz.getConstructor(Integer.class).newInstance(id);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }
}
