package com.springapp.controllers.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springapp.manager.interfaces.base.IBaseManager;
import com.springapp.models.base.EntityBase;
import com.springapp.utils.DumpFields;

public abstract class BaseController<T extends EntityBase> {

	public final static String SHOW_ACTION = "show";
	public final static String CREATE_ACTION = "create";
	public final static String UPDATE_ACTION = "update";
	public final static String DELETE_ACTION = "delete";
	public final static String LIST_ACTION = "list";

	public final static String REDIRECT = "redirect:/";

	public final static String PATH = "/";
	public final static String PATH_SHOW_FILE = PATH + SHOW_ACTION;
	public final static String PATH_CREATE_FILE = PATH + CREATE_ACTION;
	public final static String PATH_UPDATE_FILE = PATH + UPDATE_ACTION;
	public final static String PATH_DELETE_FILE = PATH + DELETE_ACTION;
	public final static String PATH_LIST_FILE = PATH + LIST_ACTION;

	public final static String ROUTE_SHOW = "{id}/" + SHOW_ACTION;
	public final static String ROUTE_CREATE = CREATE_ACTION;
	public final static String ROUTE_UPDATE = "{id}/" + UPDATE_ACTION;
	public final static String ROUTE_DELETE = "{id}/" + DELETE_ACTION;
	public final static String ROUTE_LIST = LIST_ACTION;

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
