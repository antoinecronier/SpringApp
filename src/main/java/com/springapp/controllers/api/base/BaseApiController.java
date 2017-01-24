package com.springapp.controllers.api.base;

import com.springapp.controllers.base.BaseController;
import com.springapp.models.base.EntityBase;

public class BaseApiController<T extends EntityBase> extends BaseController<T> {

	protected BaseApiController(Class<T> clazz) {
		super(clazz);
	}

}
