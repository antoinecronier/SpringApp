package com.springapp.controllers.base.view.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springapp.manager.interfaces.security.ISecurityManager;
import com.springapp.models.security.SecurityRole;
import com.springapp.models.security.SecurityUser;
import com.springapp.utils.DumpFields;

@Controller
@RequestMapping("/security")
public class SecurityViewController {

    @RequestMapping(path = "/create", method = RequestMethod.GET)
    public String createItemGet(Model model) {
        model.addAttribute("page", "Security create");
        createBaseInjects(model);
        return "security/create";
    }

    @RequestMapping(path = "/create/user", method = RequestMethod.POST)
    public String createUserPost(@ModelAttribute SecurityUser securityUser,
            Model model,RedirectAttributes redirectAttributes) {
        try {
            baseManager.create(securityUser);
        } catch (Exception e) {
            redirectAttributes.addAttribute("error",e.getMessage());
        }

        createBaseInjects(redirectAttributes);

        if (securityUser != null) {
            redirectAttributes.addAttribute("currentUser", DumpFields.fielder(securityUser));
        }

        List<SecurityRole> roles = baseManager
                .getAllSecurityRoleByUser(securityUser.getUsername());
        if (roles != null && !roles.isEmpty()) {
        	redirectAttributes.addAttribute("currentRoles", DumpFields.listFielder(roles));
        }

        return "redirect:/security/create";
    }

    @RequestMapping(path = "/create/role", method = RequestMethod.POST)
    public String createRolePost(@ModelAttribute SecurityRole securityRole,
            Model model, RedirectAttributes redirectAttributes) {
        try {
            baseManager.create(securityRole);
        } catch (Exception e) {
            redirectAttributes.addAttribute("error",e.getMessage());
        }
        createBaseInjects(redirectAttributes);
        redirectAttributes.addAttribute("currentUser", DumpFields.fielder(baseManager
                .getSecurityUser(securityRole.getUsername())));
        List<SecurityRole> roles = baseManager
                .getAllSecurityRoleByUser(securityRole.getUsername());
        redirectAttributes.addAttribute("currentRoles", DumpFields.listFielder(roles));
        return "redirect:/security/create";
    }

    private void createBaseInjects(Model model) {
        model.addAttribute("userAttributs",
                DumpFields.inspectBaseAttribut(SecurityUser.class));
        model.addAttribute("roleAttributs",
                DumpFields.inspectBaseAttribut(SecurityRole.class));
        model.addAttribute("existingRole",
                DumpFields.listFielder(baseManager.getAllUniqueRole()));
    }

    @RequestMapping(path = "/delete", method = RequestMethod.GET)
    public String deleteItemGet(@PathVariable Integer id, Model model) {
        return "security/delete";
    }

    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    public String deleteItemPost(@PathVariable Integer id, Model model) {
        return "redirect:/security/list";
    }

    @RequestMapping(path = "/update", method = RequestMethod.GET)
    public String updateItemGet(@PathVariable Integer id, Model model) {
        return "security/update";
    }

    @RequestMapping(path = "/update", method = RequestMethod.POST)
    public String updateItemPost(@ModelAttribute SecurityUser securityUser,
            Model model) {
        return "redirect:/security/list";
    }

    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String itemGet(@PathVariable Integer id, Model model) {
        return "security/show";
    }

    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public String index(Model model) {
        return "security/list";
    }

    @Autowired
    private ISecurityManager baseManager;
}
