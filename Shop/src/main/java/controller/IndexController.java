package controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.CategoryService;
import service.ProductService;

@Controller
public class IndexController {
	
	private static final String INDEX = "index";
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = {"/index","/"})
	public String showIndex(Map<String, Object> data, HttpSession session) {
		session.setAttribute("category", categoryService.getCategory());
		data.put("newList", productService.findNew());
		data.put("hotList", productService.findHot());
		return INDEX;
	}

}
