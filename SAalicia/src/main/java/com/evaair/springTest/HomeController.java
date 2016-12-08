package com.evaair.springTest;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}
	//
	@RequestMapping(value = "/home", method = RequestMethod.GET)//這裡的home是看你從jsp那邊傳回來什麼,如果傳回home就執行以下方法
	public ModelAndView Home()/*Home這個名字根本可以亂取*/ {
		ModelAndView home = new ModelAndView("home");//這裡的home表示所連到的頁面
		return home;
	}
	@RequestMapping(value = "/SignIn", method = RequestMethod.GET)
	public ModelAndView SignIn() {
		ModelAndView model = new ModelAndView("SignIn");
		return model;
	}
	
    @RequestMapping(value = "/Mobilephone", method = RequestMethod.GET)
	public ModelAndView Mobilephone() {
		ModelAndView model = new ModelAndView("Mobilephone");
		return model;
	}
    @RequestMapping(value = "/Mouse", method = RequestMethod.GET)
	public ModelAndView Mouse() {
		ModelAndView model = new ModelAndView("Mouse");
		return model;
	}
    @RequestMapping(value = "/Audioeq", method = RequestMethod.GET)
	public ModelAndView Audioeq() {
		ModelAndView model = new ModelAndView("Audioeq");
		return model;
	}
    @RequestMapping(value = "/Charger", method = RequestMethod.GET)
	public ModelAndView Charger() {
		ModelAndView model = new ModelAndView("Charger");
		return model;
	}
    
	
}
	
	
	
	
	
	
	
	
	
	