package com.zohocrm.conntroller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/viewLeadPage3")
	private String viewLeadPage3() {
		return "create_lead";
	}
	
	@RequestMapping("/saveLead")
	private String saveLead(@ModelAttribute("lead")Lead lead , ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
	
	@RequestMapping("/composeEmail")
	private String composeEmail(@RequestParam("email")String email , ModelMap model){
		model.addAttribute("email", email);
		return "compose_Email";
	}
	@RequestMapping("/ConvertLead")
	private String ConvertLead(@RequestParam("id")Long id , ModelMap model) {
		model.addAttribute("msg", "ConvertedToLead...!!");
			Lead lead = leadService.getOneLead(id);
			
			Contact conn = new Contact();
			conn.setFirstname(lead.getFirstname());
			conn.setLastname(lead.getLastname());
			conn.setEmail(lead.getEmail());
			conn.setMobile(lead.getMobile());
			conn.setSource(lead.getSource());
			
			contactService.saveOneContact(conn);
			
			leadService.deleteOneLead(id);
		return "lead_info";
		
	}
	
	@RequestMapping("/ListAll")
	public String getOneLead(ModelMap model) {
		List <Lead> lead =leadService.getALLlead();
		model.addAttribute("lead", lead);
		return "list_all_lead";
	}
	
	@RequestMapping("/findByIdLead")
	public String findById(@RequestParam("id") long id , ModelMap model) {
		Lead lead = leadService.getOneLead(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
}










