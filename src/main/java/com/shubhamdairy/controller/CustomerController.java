package com.shubhamdairy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shubhamdairy.model.CustomerEntity;
import com.shubhamdairy.service.CustomerSevice;

@Controller
public class CustomerController {

	@Autowired
	CustomerSevice customerSevice;

	@GetMapping
	@RequestMapping(value = "/hello")
	public String getMessage() {
		return "Hello this is controller Demo";
	}

	/*
	 * @PostMapping
	 * 
	 * @RequestMapping(value = "/save") public ResponseEntity<CustomerEntity>
	 * create(@Valid @RequestBody CustomerEntity customerEntity) { return
	 * ResponseEntity.ok(customerSevice.save(customerEntity)); }
	 */
	
	
	@GetMapping
	//@ResponseBody
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<CustomerEntity> listcustomers = customerSevice.listAll();
		model.addAttribute("listcustomers", listcustomers);
		System.out.println(" List of records" + listcustomers.toString());
		return "index";
	}

	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		CustomerEntity customerEntity = new CustomerEntity();
		model.addAttribute("customerEntity", customerEntity);

		return "new_product";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("customerEntity") CustomerEntity customerEntity) {
		customerSevice.save(customerEntity);
	     
	    return "redirect:/";
	}
	
	
	@RequestMapping("/delete/{custId}")
	public String deleteProduct(@PathVariable(name = "custId") long custId) {
		customerSevice.deleteByCustomerID(custId);
	    return "redirect:/";       
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") long id) {
	    ModelAndView modelAndView = new ModelAndView("edit_product");
	    CustomerEntity customerEntity = customerSevice.getByCustomerId(id);
	    modelAndView.addObject("customerEntity", customerEntity);
	     
	    return modelAndView;
	}
	
	/*
	 * @RequestMapping("/") public String welcome(Map<String, Object> model) {
	 * return "welcome"; }
	 */
	 
}
