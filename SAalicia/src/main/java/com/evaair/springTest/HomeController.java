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
	//這段的意思是一run就顯示home那頁
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}
	//消費者觀的頁面們
	@RequestMapping(value = "/home", method = RequestMethod.GET)//這裡的home是看你從jsp那邊傳回來什麼,如果傳回home就執行以下方法
	public ModelAndView Home()/*Home這個名字根本可以亂取*/ {
		ModelAndView home = new ModelAndView("home");//這裡的home表示所連到的頁面
		return home;
	}
	
	@RequestMapping(value = "/ShoppingCar", method = RequestMethod.GET)
	public ModelAndView ShoppingCar() {
		ModelAndView model = new ModelAndView("ShoppingCar");
		return model;
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
    //管理者觀的頁面們
    @RequestMapping(value = "/ManagerHome", method = RequestMethod.GET)
	public ModelAndView ManagerHome() {
		ModelAndView model = new ModelAndView("ManagerHome");
		return model;
	}
	@RequestMapping(value = "/SalesOrderList", method = RequestMethod.GET)
	public ModelAndView SalesOrderList() {
		ModelAndView model = new ModelAndView("SalesOrderList");
		return model;
	}
	@RequestMapping(value = "/ShippingList", method = RequestMethod.GET)
	public ModelAndView ShippingList() {
		ModelAndView model = new ModelAndView("ShippingList");
		return model;
	}
	@RequestMapping(value = "/InventoryList", method = RequestMethod.GET)
	public ModelAndView InventoryList() {
		ModelAndView model = new ModelAndView("InventoryList");
		return model;
	}
	@RequestMapping(value = "/CusServiceList", method = RequestMethod.GET)
	public ModelAndView CusServiceList() {
		ModelAndView model = new ModelAndView("CusServiceList");
		return model;
	}
    
	
}
	
	
	
	
	
	
	
	
	
	