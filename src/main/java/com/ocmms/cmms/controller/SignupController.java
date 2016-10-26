package com.ocmms.cmms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ocmms.cmms.model.Users;
import com.ocmms.cmms.repository.UsersService;
import com.ocmms.cmms.support.web.MessageHelper;

@Controller
public class SignupController {

	private static final String SIGNUP_VIEW_NAME = "signup/signup";

	private Boolean userNameExist=false;
	
	@Autowired
	private UsersService usersService;

	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public String signup(ModelMap model) {
		model.addAttribute("user", new Users());
		if(!userNameExist){
			model.addAttribute("userNameExist", true);
		}
		return SIGNUP_VIEW_NAME;
	}

	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public String saveUser(@Valid @ModelAttribute Users user, final BindingResult bindingResult, Errors errors,
			RedirectAttributes ra) {
		if (bindingResult.hasErrors()) {
			return SIGNUP_VIEW_NAME;
		}
		if (this.usersService.save(user) == null) {
			userNameExist=true;
			return SIGNUP_VIEW_NAME;
		} else {
			this.usersService.signin(user);
			MessageHelper.addSuccessAttribute(ra, "signup.success");
			return "redirect:/";
		}
		

	}

}
