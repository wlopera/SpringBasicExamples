package com.wlopera.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	// http://localhost:8080/SpringBasicWeb/welcome
	@RequestMapping(value = "/welcome")
	public ModelAndView welcome() {

		System.out.println("Peticion HTTP-GEt... [.../welcome]");
		ModelAndView mav = new ModelAndView();

		mav.addObject("title", "Bienvenido a Spring WEB [.../welcome]");
		mav.addObject("message", "Ejemplo de Spring WEB - JSP");
		mav.addObject("description", "@RequestMapping(value =/welcome) public ModelAndView welcome()");

		mav.setViewName("hello");

		return mav;
	}

	// http://localhost:8080/SpringBasicWeb/hello?name=wlopera
	@RequestMapping(value = "/hello")
	public ModelAndView hello(@RequestParam("name") String name) {

		System.out.println("Peticion HTTP-GEt... [../hello?name=name]");
		ModelAndView mav = new ModelAndView();

		mav.addObject("title", "Ejemplo de Spring WEB - JSP [../hello?name=name]");
		mav.addObject("message", "Bienvenido " + name + " a Spring WEB");
		mav.addObject("description",
				"@RequestMapping(value =/hello?name=name) public ModelAndView hello(@RequestParam(name) String name)");

		mav.setViewName("hello");

		return mav;
	}

	// http://localhost:8080/SpringBasicWeb/hello/wlopera
	@RequestMapping(value = "/hello/{name}")
	public ModelAndView welcome(@PathVariable("name") String name) {

		System.out.println("Peticion HTTP-GEt... [../hello/{name}]");
		ModelAndView mav = new ModelAndView();

		mav.addObject("title", "Ejemplo de Spring WEB - JSP [../hello/{name}]");
		mav.addObject("message", "Bienvenido " + name + " a Spring WEB");
		mav.addObject("description",
				"@RequestMapping(value =/hello/{name}) public ModelAndView welcome(@PathVariable(name) String name)");

		mav.setViewName("hello");

		return mav;
	}
}
