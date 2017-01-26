package com.springapp.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapp.controllers.base.view.BaseViewController;
import com.springapp.models.Namespace;

@Controller
@RequestMapping(NamespaceViewController.BASE_URL)
public class NamespaceViewController extends BaseViewController<Namespace> {

	public final static String BASE_URL = "/namespace";

	protected NamespaceViewController() {
		super(Namespace.class);
	}
}
