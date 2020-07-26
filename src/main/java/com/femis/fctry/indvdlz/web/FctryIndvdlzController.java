package com.femis.fctry.indvdlz.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.femis.fctry.cmmn.model.FctryCmmnVO;

@Controller
@RequestMapping(value="/fctry/indvdlz")
public class FctryIndvdlzController {
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(FctryIndvdlzController.class);
	
	@RequestMapping(value = "/posesPapers.do")
	public String posesPapers(HttpServletRequest request, HttpServletResponse response, Model model,FctryCmmnVO vo) throws Exception {
		
		LOGGER.debug("/posesPapers.do");
		LOGGER.debug("request fctryManageNo" + request.getParameter("fctryManageNo"));
		LOGGER.debug("request cvplManageNo" + request.getParameter("cvplManageNo"));
		
		model.addAttribute("vo", vo);
		
		return "fctry/indvdlz/posesPapers";
	}
	
}
