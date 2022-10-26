package com.zohocrm.conntroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;
import com.zohocrm.services.BillingService;
import com.zohocrm.services.ContactService;

@Controller
public class BillingController {

	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/GenerateBill")
	private String getContactId(@RequestParam("id")Long id ,ModelMap model) {
		Contact contact =contactService.getContactId(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
	
	@RequestMapping("/saveBill")
	private String saveOneBill(@ModelAttribute("bill")Billing bill) {
		billingService.saveOneBill(bill);
		return "create_lead";
		
	}
}



