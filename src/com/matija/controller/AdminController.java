package com.matija.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdminController {

	@Secured("ROLE_ADMIN")
	@GetMapping("/admin")
	public String getLogin(Model model){
		return "admin";
	}
}
