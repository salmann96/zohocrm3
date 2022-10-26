package com.zohocrm.conntroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.services.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/ListAllContacts")
	private String getAllContacts(ModelMap model) {
	List <Contact> contact =contactService.getAllContacts();
	model.addAttribute("contact", contact);
	return "list_all_contact";
	}
	
	@RequestMapping("/findByIdContact")
	private String findOneContact(@RequestParam("id") Long id , ModelMap model) {
		Contact contact = contactService.getbyid(id);
		model.addAttribute("contact", contact);
		return "contact_info";
	}
	
	
}











