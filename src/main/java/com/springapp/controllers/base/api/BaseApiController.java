package com.springapp.controllers.base.api;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springapp.controllers.base.BaseController;
import com.springapp.models.base.EntityBase;
import com.springapp.utils.JsonManager;

@RestController
public abstract class BaseApiController<T extends EntityBase> extends BaseController<T> {

	public final static String BASE_API_URL = "/api";

	private String baseName;

	protected BaseApiController(Class<T> clazz) {
		super(clazz);
		this.baseName = this.getClazz().getSimpleName().toLowerCase();
	}

	@RequestMapping(path = ROUTE_CREATE, method = RequestMethod.POST, produces = "application/json")
	public Object createItemPost(T item) {
		try {
			return super.createItem(item);
		} catch (Exception e) {
			return "Error : "+e.getStackTrace();
		}
	}

	@RequestMapping(path = ROUTE_DELETE, method = RequestMethod.POST, produces = "application/json")
	public Object deleteItemPost(Integer id) {
		try {
			super.deleteItem(id);
		} catch (Exception e) {
			return "Error : "+e.getStackTrace();
		}

		return "Item deleted";
	}

	@RequestMapping(path = ROUTE_UPDATE, method = RequestMethod.POST, produces = "application/json")
	public Object updateItemPost(@ModelAttribute T item) {
		try {
			return super.updateItem(item);
		} catch (Exception e) {
			return "Error : "+e.getStackTrace();
		}
	}

	@RequestMapping(path = ROUTE_SHOW, method = RequestMethod.GET, produces = "application/json")
	public Object itemGet(@PathVariable Integer id) {
		try {
			return super.getItem(id);
		} catch (Exception e) {
			return "Error : "+e.getStackTrace();
		}
	}

	@RequestMapping(path = ROUTE_LIST, method = RequestMethod.GET, produces = "application/json")
	public Object index() {
		try {
			return super.getItems();
		} catch (Exception e) {
			return "Error : "+e.getStackTrace();
		}
	}
}
