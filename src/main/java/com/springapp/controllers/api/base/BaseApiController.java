package com.springapp.controllers.api.base;

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

	private String baseName;

	protected BaseApiController(Class<T> clazz) {
		super(clazz);
		this.baseName = this.getClazz().getSimpleName().toLowerCase();
	}

	@RequestMapping(path = ROUTE_CREATE, method = RequestMethod.POST)
	public String createItemPost(T item) {
		try {
			return JsonManager.getInstance().addItem(super.createItem(item)).toJSON();
		} catch (Exception e) {
			return "Error : "+e.getStackTrace();
		}
	}

	@RequestMapping(path = ROUTE_DELETE, method = RequestMethod.POST)
	public String deleteItemPost(Integer id) {
		try {
			super.deleteItem(id);
		} catch (Exception e) {
			return "Error : "+e.getStackTrace();
		}

		return "Item deleted";
	}

	@RequestMapping(path = ROUTE_UPDATE, method = RequestMethod.POST)
	public String updateItemPost(@ModelAttribute T item) {
		try {
			return JsonManager.getInstance().addItem(super.updateItem(item)).toJSON();
		} catch (Exception e) {
			return "Error : "+e.getStackTrace();
		}
	}

	@RequestMapping(path = ROUTE_SHOW, method = RequestMethod.GET)
	public String itemGet(@PathVariable Integer id) {
		try {
			return JsonManager.getInstance().addItem(super.getItem(id)).toJSON();
		} catch (Exception e) {
			return "Error : "+e.getStackTrace();
		}
	}

	@RequestMapping(path = ROUTE_LIST, method = RequestMethod.GET)
	public String index() {
		try {
			return JsonManager.getInstance().addItem(super.getItems()).toJSON();
		} catch (Exception e) {
			return "Error : "+e.getStackTrace();
		}
	}
}
