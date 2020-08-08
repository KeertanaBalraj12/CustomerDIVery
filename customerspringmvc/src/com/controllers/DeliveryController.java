package com.controllers;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Beanclass.DeliveryProductBean;
import com.Beanclass.Deliverylogin;
import com.DAOclass.DeliveryDao;
import com.DAOclass.DeliveryProductDao;



@Controller
public class DeliveryController {
	
	private DeliveryDao deliverydao;
	
	@Autowired
	public void setInventorydao(DeliveryDao deliverydao) {
		this.deliverydao = deliverydao;
	}
	

	private DeliveryProductDao delprod;
	@Autowired
		public void setDelprod(DeliveryProductDao delprod) {
		this.delprod = delprod;
	}

	@RequestMapping("/logindelivery")
	public String inventorylogin(@RequestParam("UserID") String UserID , @RequestParam("Password") String Password) throws ClassNotFoundException
	{
		Deliverylogin delbean = new Deliverylogin();
		delbean.setUserID(UserID);
		delbean.setPassword(Password);
		
		if(deliverydao.validate(delbean))
		{
			return "nextpagedelivery";
		}
		else
			return "errorpagefordelivery";		
	
	}
	
	@RequestMapping("/allproductslist")
	public ModelAndView getAllproductspage() throws SQLException {
		ModelAndView model = new ModelAndView();
		model.addObject("list", delprod.selectAllproducts());
		model.setViewName("alldeliveryprod");
		return model;
	}
	
	@RequestMapping(value="/emergencyProducts")
	public ModelAndView emergencyproduct() throws SQLException
	{
		ModelAndView model = new ModelAndView();
		model.addObject("x", delprod.selectProductbystatus());
		model.setViewName("emergency");
		return model;
		
	}
	
	@RequestMapping(value="/returnedProducts")
	public ModelAndView returntowarehouse() throws SQLException
	{
		ModelAndView model = new ModelAndView();
		model.addObject("x", delprod.selectReturntoWarehouse());
		model.setViewName("returned");
		return model;
		
	}
	@RequestMapping("/pendingDelivery")
	public ModelAndView pendingdelivery() throws SQLException
	{
		ModelAndView model = new ModelAndView();
		model.addObject("x", delprod.selectPendingDelivery());
		model.setViewName("pending");
		return model;
		
	}
	
	@RequestMapping(value = "/saveproduct", method = RequestMethod.POST)
	public String saveproductlist(@ModelAttribute("delbean") DeliveryProductBean delBean) throws SQLException {
		delprod.insertproduct(delBean);
		return "redirect:/viewprod";
	}

	@RequestMapping("/viewprod")
	public String viewProducts(Model m) throws SQLException {
		List<DeliveryProductBean> list = delprod.selectAllproducts();
		m.addAttribute("list", list);
		return "alldeliveryprod";
	}
	@RequestMapping("/deliveryontheDate")
	public ModelAndView showDeliveryonDatelist(@RequestParam("fromDate") String fromDate , @RequestParam("toDate") String toDate) throws SQLException
	{
		ModelAndView model = new ModelAndView();
		model.addObject("x", delprod.selectProductbyDate(fromDate,toDate));
		model.setViewName("deliverybydate");
		return model;
	}
	@RequestMapping(value="/editdelivery")
	public ModelAndView editAClist(@RequestParam("deliveryNoteNo") int deliveryNoteNo ) throws SQLException
	{
		ModelAndView model = new ModelAndView();
		model.addObject("del", delprod.selectProductbydeliveryNoteNo(deliveryNoteNo));
		model.setViewName("editDelivery");
		return model;
		
	}
	@RequestMapping(value="/updatedelivery" , method = RequestMethod.POST)
	public String updateDeliverylist(@ModelAttribute("delbean") DeliveryProductBean delbean ) throws ClassNotFoundException, SQLException
	{
		delprod.updateProduct(delbean);
		return "redirect:/viewprod";
	}

	@RequestMapping("/logoutdelivery")
	public String logoutac(HttpServletRequest request) {
		HttpSession session =  request.getSession();  
		session.invalidate();
		return "index";
	}
}
