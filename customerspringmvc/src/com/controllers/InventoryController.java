package com.controllers;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Beanclass.InventoryProductBean;
import com.Beanclass.Inventorylogin;
import com.DAOclass.ACDao;
import com.DAOclass.InventoryDao;
import com.DAOclass.TvInventoryDao;
import com.DAOclass.WashingmachineDao;

@Controller
public class InventoryController {

	private InventoryDao inventorydao;

	@Autowired
	public void setInventorydao(InventoryDao inventorydao) {
		this.inventorydao = inventorydao;
	}

	private WashingmachineDao wminvendao;

	@Autowired
	public void setWminvendao(WashingmachineDao wminvendao) {
		this.wminvendao = wminvendao;
	}

	private TvInventoryDao tvinvendao;

	@Autowired
	public void setTvinvendao(TvInventoryDao tvinvendao) {
		this.tvinvendao = tvinvendao;
	}

	private ACDao acinvendao;

	@Autowired
	public void setAcinvendao(ACDao acinvendao) {
		this.acinvendao = acinvendao;
	}
	
	private InventoryProductBean invenprodbean;
	@Autowired
	public void setInvenprodbean(InventoryProductBean invenprodbean) {
		this.invenprodbean = invenprodbean;
	}

	@RequestMapping("/logininventory")
	public String inventorylogin(@RequestParam("UserID") String UserID, @RequestParam("Password") String Password)
			throws ClassNotFoundException {
		Inventorylogin invenbean = new Inventorylogin();
		invenbean.setUserID(UserID);
		invenbean.setPassword(Password);

		if (inventorydao.validate(invenbean)) {
			return "productcateinventory";
		} else
			return "errorpageforinventory";

	}

	@RequestMapping("/tvlist")
	public ModelAndView getTvpage() throws SQLException {
		ModelAndView model = new ModelAndView();
		model.addObject("list", tvinvendao.selectAllproducts());
		model.setViewName("tv");
		return model;
	}

	@RequestMapping(value = "/savetv", method = RequestMethod.POST)
	public String saveTvlist(@ModelAttribute("tvinvenbean") InventoryProductBean tvinvenbean) throws SQLException {
		tvinvendao.insertproduct(tvinvenbean);
		return "redirect:/viewtv";
	}

	@RequestMapping("/viewtv")
	public String viewtv(Model m) throws SQLException {
		List<InventoryProductBean> list = tvinvendao.selectAllproducts();
		m.addAttribute("list", list);
		return "tv";
	}
	
	@RequestMapping(value="/edittv")
	public ModelAndView editTvlist(@RequestParam("productCode") int productCode ) throws SQLException
	{
		ModelAndView model = new ModelAndView();
		model.addObject("tv", tvinvendao.selectProduct(productCode));
		model.setViewName("editTv");
		return model;
		
	}
	@RequestMapping(value="/updatetv" , method = RequestMethod.POST)
	public String updateTvlist(@ModelAttribute("tvinvenbean") InventoryProductBean tvinvenbean ) throws ClassNotFoundException, SQLException
	{
		tvinvendao.updateProduct(tvinvenbean);
		return "redirect:/viewtv";
	}
	@RequestMapping("/tvinventoryontheDate")
	public ModelAndView showtvinventoryonDatelist(@RequestParam("fromDate") String fromDate , @RequestParam("toDate") String toDate) throws SQLException
	{
		ModelAndView model = new ModelAndView();
		model.addObject("x", tvinvendao.selectProductbyDate(fromDate,toDate));
		model.setViewName("productbydate");
		return model;
	}
	@RequestMapping(value="/showTvbyproductcode")
	public ModelAndView showTvlist(@RequestParam("productCode") int productCode ) throws SQLException
	{
		ModelAndView model = new ModelAndView();
		model.addObject("x", tvinvendao.selectProduct(productCode));
		model.setViewName("showlist");
		return model;
		
	}
	@RequestMapping("/logoutTv")
	public String logouttv(HttpServletRequest request) {
		HttpSession session =  request.getSession();  
		session.invalidate();
		return "index";
	}
	
	/*/ **********
	*
	*
	*
	*
	*
	*
	
	*/
	@RequestMapping("/wmlist")
	public ModelAndView getWMpage() throws SQLException {
		ModelAndView model = new ModelAndView();
		model.addObject("list", wminvendao.selectAllproducts());
		model.setViewName("washingmachine");
		return model;
	}

	@RequestMapping(value = "/savewm", method = RequestMethod.POST)
	public String saveWMlist(@ModelAttribute("wminvenbean") InventoryProductBean wminvenbean) throws SQLException {
		wminvendao.insertproduct(wminvenbean);
		return "redirect:/viewwm";
	}

	@RequestMapping("/viewwm")
	public String viewWM(Model m) throws SQLException {
		List<InventoryProductBean> list = wminvendao.selectAllproducts();
		m.addAttribute("list", list);
		return "washingmachine";
	}

	@RequestMapping(value = "/deletewm")
	public String deleteWMlist(@RequestParam("productCode") int productCode) throws SQLException {
		invenprodbean.setProductCode(productCode);
		boolean b = wminvendao.deleteProduct(productCode);
		if (b) {
			return "redirect:/viewwm";
		} else {
			return "";
		}
	}
	@RequestMapping(value="/editwm")
	public ModelAndView editWMlist(@RequestParam("productCode") int productCode ) throws SQLException
	{
		ModelAndView model = new ModelAndView();
		model.addObject("wm", wminvendao.selectProduct(productCode));
		model.setViewName("editWM");
		return model;
		
	}
	@RequestMapping(value="/updatewm" , method = RequestMethod.POST)
	public String updateWMlist(@ModelAttribute("wminvenbean") InventoryProductBean wminvenbean ) throws ClassNotFoundException, SQLException
	{
		wminvendao.updateProduct(wminvenbean);
		return "redirect:/viewwm";
	}
	
	@RequestMapping("/wminventoryontheDate")
	public ModelAndView showwminventoryonDatelist(@RequestParam("fromDate") String fromDate , @RequestParam("toDate") String toDate) throws SQLException
	{
		ModelAndView model = new ModelAndView();
		model.addObject("x", wminvendao.selectProductbyDate(fromDate,toDate));
		model.setViewName("productbydate");
		return model;
	}
	
	@RequestMapping(value="/showWMbyproductcode")
	public ModelAndView showWMlist(@RequestParam("productCode") int productCode ) throws SQLException
	{
		ModelAndView model = new ModelAndView();
		model.addObject("x", wminvendao.selectProduct(productCode));
		model.setViewName("showlist");
		return model;
		
	}
	@RequestMapping("/logoutWM")
	public String logoutwm(HttpServletRequest request) {
		HttpSession session =  request.getSession();  
		session.invalidate();
		return "index";
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@RequestMapping("/aclist")
	public ModelAndView getACpage() throws SQLException {
		ModelAndView model = new ModelAndView();
		model.addObject("list", acinvendao.selectAllproducts());
		model.setViewName("ac");
		return model;
	}

	@RequestMapping(value = "/saveac", method = RequestMethod.POST)
	public String saveAClist(@ModelAttribute("acinvenbean") InventoryProductBean acinvenbean) throws SQLException {
		acinvendao.insertproduct(acinvenbean);
		return "redirect:/viewac";
	}

	@RequestMapping("/viewac")
	public String viewAC(Model m) throws SQLException {
		List<InventoryProductBean> list = acinvendao.selectAllproducts();
		m.addAttribute("list", list);
		return "ac";
	}

	@RequestMapping(value = "/deleteac")
	public String deleteAClist(@RequestParam("productCode") int productCode) throws SQLException {
		invenprodbean.setProductCode(productCode);
		boolean b = acinvendao.deleteProduct(productCode);
		if (b) {
			return "redirect:/viewac";
		} else {
			return "";
		}
	}
	@RequestMapping(value="/editac")
	public ModelAndView editAClist(@RequestParam("productCode") int productCode ) throws SQLException
	{
		ModelAndView model = new ModelAndView();
		model.addObject("ac", acinvendao.selectProduct(productCode));
		model.setViewName("editAC");
		return model;
		
	}
	@RequestMapping(value="/updateac" , method = RequestMethod.POST)
	public String updateAClist(@ModelAttribute("acinvenbean") InventoryProductBean acinvenbean ) throws ClassNotFoundException, SQLException
	{
		acinvendao.updateProduct(acinvenbean);
		return "redirect:/viewac";
	}
	@RequestMapping(value="/showACbyproductcode")
	public ModelAndView showAClist(@RequestParam("productCode") int productCode ) throws SQLException
	{
		ModelAndView model = new ModelAndView();
		model.addObject("x", acinvendao.selectProduct(productCode));
		model.setViewName("showlist");
		return model;
		
	}
	
	@RequestMapping("/acinventoryontheDate")
	public ModelAndView showacinventoryonDatelist(@RequestParam("fromDate") String fromDate , @RequestParam("toDate") String toDate) throws SQLException
	{
		ModelAndView model = new ModelAndView();
		model.addObject("x", acinvendao.selectProductbyDate(fromDate,toDate));
		model.setViewName("productbydate");
		return model;
	}
	
	@RequestMapping("/logoutac")
	public String logoutac(HttpServletRequest request) {
		HttpSession session =  request.getSession();  
		session.invalidate();
		return "index";
	}
	

}
