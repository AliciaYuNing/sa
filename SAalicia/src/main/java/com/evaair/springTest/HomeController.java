package com.evaair.springTest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.evaair.springTest.HomeController;
import com.sample.product.dao.ProductDAO;
import com.sample.product.dao.SalesOrderDAO;
import com.sample.product.entity.Product;
import com.sample.product.entity.ShoppingCar;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		return getProductList();
	}// getProductList
		// list all products
	
	//消費者觀的頁面們======================================================================================
	@RequestMapping(value = "/home", method = RequestMethod.GET)//這裡的home是看你從jsp那邊傳回來什麼,如果傳回home就執行以下方法
	public ModelAndView getProductList() {
		ModelAndView model = new ModelAndView("home");//這裡的home表示所連到的jsp頁面名稱
		ProductDAO dao = (ProductDAO) context.getBean("productDAO");
		List<Product> list = dao.getList();
		model.addObject(list);
		return model;
	
	    }
	
	@RequestMapping(value = "/ShoppingCar", method = RequestMethod.GET)
		public ModelAndView showing(@ModelAttribute Product product) {
			ModelAndView model = new ModelAndView("ShoppingCar");
			ShoppingCar ShoppingCar = (ShoppingCar) context.getBean("ShoppingCarList");
			List<Product> list = ShoppingCar.getCar();
			System.out.println("size:" + list.size());
			model.addObject("productList", list);
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
    
    //管理者觀的頁面們=====================================================================
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
    //==========================ShoppingCar============================

	@RequestMapping(value = "/AddShoppingCar", method = RequestMethod.GET)
	public ModelAndView adding(@ModelAttribute Product product) {
		ModelAndView model = new ModelAndView("redirect:/home");
		long pid = product.getId();// 抓產品id
		ProductDAO dao = (ProductDAO) context.getBean("productDAO");
		product = dao.get(product.getId());
		System.out.println("addshoppingcart:" + pid);
		ShoppingCar ShoppingCar = (ShoppingCar) context.getBean("ShoppingCarList");
		ShoppingCar.insert(product);
		return model;
	}// AddShoppingCart
	

	@RequestMapping(value = "/deletesShoppingCar", method = RequestMethod.GET)
	public ModelAndView deletesShopping(@ModelAttribute Product id) {
		ModelAndView model = new ModelAndView("redirect:/ShoppingCar");
		ShoppingCar shoppingCart = (ShoppingCar) context.getBean("ShoppingCarList");
		shoppingCart.delete(id.getShoppingId());
		System.out.println("delete :"+ id.getShoppingId());
		// shoppingCart.delete(id);
		return model;
	}// deleteShoppingCart

	
	@RequestMapping(value = "/CheckOut", method = RequestMethod.GET)
		public ModelAndView CheckOut() {
			ModelAndView model = new ModelAndView("CheckOut");
			return model;
		}

	@RequestMapping(value = "/Submit", method = RequestMethod.POST)
	public ModelAndView insertProduct(@ModelAttribute Product product) throws SQLException {
		ModelAndView model = new ModelAndView("home");
		SalesOrderDAO dao = (SalesOrderDAO) context.getBean("SalesOrderDAO");
		   
		return model;
		
	}// insert customer infomation
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	