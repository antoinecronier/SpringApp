package com.springapp.controllers.base;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springapp.manager.interfaces.base.IBaseManager;
import com.springapp.models.base.EntityBase;
import com.springapp.utils.DumpFields;

public abstract class BaseController<T extends EntityBase> {

	private Class<T> clazz;

	/**
	 * @return the clazz
	 */
	protected Class<T> getClazz() {
		return clazz;
	}

	protected BaseController(Class<T> clazz){
		this.clazz = clazz;
	}

	public String createItem(@ModelAttribute T item) {
		try {
			baseManager.create(item);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "Teacher succesfully created!";
	}

	public String deleteItem(Integer id) {
		try {
			T item = DumpFields.createContents(id, clazz);
			baseManager.delete(item);
		} catch (Exception ex) {
			return "Error deleting the user: " + ex.toString();
		}
		return "Teacher succesfully deleted!";
	}

	public String updateItem(@ModelAttribute T item) {
		try {
			baseManager.update(item);
		} catch (Exception ex) {
			return "Error updating the user: " + ex.toString();
		}
		return "Teacher succesfully updated!";
	}

	public T getItem(Integer id) {
		T item = null;
		try {
			item = baseManager.getById(id);
		} catch (Exception ex) {
			System.err.println("Error getting the user: " + ex.toString());
		}
		return item;
	}

	public List<T> getItems() {
		List<T> item = null;
		try {
			item = baseManager.getAll();
		} catch (Exception ex) {
			System.err.println("Error getting the user: " + ex.toString());
		}
		return item;
	}

	@Autowired
	private IBaseManager<T> baseManager;
}
