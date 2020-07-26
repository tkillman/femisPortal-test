package com.femis.main.web;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.femis.fctry.indvdlz.web.FctryIndvdlzController;

@Controller
@RequestMapping(value = "/main")
public class MainController {
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(FctryIndvdlzController.class);
	
	@RequestMapping(value = "/main.do")
	public String main(Model model, HttpServletResponse response) throws Exception {
		
		LOGGER.debug("main.do exec");
		
		return "main/main";
	}
}
