package com.springapp.controllers.view.base;

import java.util.ArrayList;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springapp.controllers.base.BaseController;
import com.springapp.models.base.EntityBase;
import com.springapp.utils.DumpFields;

@Controller
public abstract class BaseViewController<T extends EntityBase> extends
		BaseController<T> {
	private String baseName;

	protected ArrayList<String> classAttributs;

	protected String createView;
	protected String createRedirect;

	protected String deleteView;
	protected String deleteRedirect;

	protected String updateView;
	protected String updateRedirect;

	protected String showView;
	protected String showRedirect;

	protected String listView;
	protected String listRedirect;

	protected BaseViewController(Class<T> clazz) {
		super(clazz);

		this.baseName = this.getClazz().getSimpleName().toLowerCase();

		this.classAttributs = DumpFields.<T> inspect(this.getClazz());

		this.createView = this.baseName + PATH_CREATE_FILE;
		this.deleteView = this.baseName + PATH_DELETE_FILE;
		this.updateView = this.baseName + PATH_UPDATE_FILE;
		this.showView = this.baseName + PATH_SHOW_FILE;
		this.listView = this.baseName + PATH_LIST_FILE;

		this.createRedirect = REDIRECT + this.baseName + PATH_LIST_FILE;
		this.deleteRedirect = REDIRECT + this.baseName + PATH_LIST_FILE;
		this.updateRedirect = REDIRECT + this.baseName + PATH_LIST_FILE;
		this.showRedirect = REDIRECT + this.baseName + PATH_LIST_FILE;
		this.listRedirect = REDIRECT + this.baseName + PATH_LIST_FILE;
	}

	@RequestMapping(path = ROUTE_CREATE, method = RequestMethod.GET)
	public String createItemGet(Model model) {
		model.addAttribute("page", this.baseName + " " + CREATE_ACTION);
		model.addAttribute("attributs", this.classAttributs);
		return createView;
	}

	@RequestMapping(path = ROUTE_CREATE, method = RequestMethod.POST)
	public String createItemPost(T item, Model model) {
		super.createItem(item);
		model.addAttribute("attributs", this.classAttributs);
		model.addAttribute("currentItems", super.getItems());
		return createRedirect;
	}

	@RequestMapping(path = ROUTE_DELETE, method = RequestMethod.GET)
	public String deleteItemGet(@PathVariable Integer id, Model model) {
		model.addAttribute("page", this.baseName + " " + DELETE_ACTION);
		model.addAttribute("currentItem", super.getItem(id));
		return deleteView;
	}

	@RequestMapping(path = ROUTE_DELETE, method = RequestMethod.POST)
	public String deleteItemPost(@PathVariable Integer id, Model model) {
		super.deleteItem(id);
		model.addAttribute("attributs", this.classAttributs);
		model.addAttribute("currentItems", super.getItems());
		return deleteRedirect;
	}

	@RequestMapping(path = ROUTE_UPDATE, method = RequestMethod.GET)
	public String updateItemGet(@PathVariable Integer id, Model model) {
		model.addAttribute("page", this.baseName + " " + UPDATE_ACTION);
		model.addAttribute("currentItem", super.getItem(id));
		return updateView;
	}

	@RequestMapping(path = ROUTE_UPDATE, method = RequestMethod.POST)
	public String updateItemPost(@ModelAttribute T item, Model model) {
		super.updateItem(item);
		model.addAttribute("attributs", this.classAttributs);
		model.addAttribute("currentItems", super.getItems());
		return updateRedirect;
	}

	@RequestMapping(path = ROUTE_SHOW, method = RequestMethod.GET)
	public String itemGet(@PathVariable Integer id, Model model) {
		model.addAttribute("page", this.baseName + " " + SHOW_ACTION);
		model.addAttribute("currentItem", super.getItem(id));
		return showView;
	}

	@RequestMapping(path = ROUTE_LIST, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("page", this.baseName + " " + LIST_ACTION);
		model.addAttribute("attributs", this.classAttributs);
		model.addAttribute("currentItems", super.getItems());
		return listView;
	}
}
