package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;



@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {

		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");

		Date date = new Date();
		messages.add(String.valueOf(date));

		model.addAttribute("messages", messages);


		return "index";
	}

	
}