/**
 * 
 */
package com.pujanov.unlimited.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pujanov.unlimited.dto.PersonDTO;
import com.pujanov.unlimited.service.PersonService;

/**
 * @author Pujan K.C. <pujanov69@gmail.com>
 *
 * Created on Dec 26, 2019
 */


@Controller
@RequestMapping(value = {"/", "/index"})
public class HomeController {

	@Autowired
	private PersonService personService;
	
	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping
	public String getIndexPage(Model model) {
		List<PersonDTO> people = personService.getAllPeopleByCountry("United States");
		System.out.println("######--->"+ people.toString());
		model.addAttribute("peopleList", people);
		return "index";
	}
	
	@GetMapping("/scanner-specific/{scanner_name}")
	public String getScannerPersonPage(@PathVariable("scanner_name") String scannerName, Model model) {
		
		model.addAttribute("scanner_name", scannerName);
		List<PersonDTO> people = personService.getAllPeopleByScanner(scannerName);
		System.out.println("######--->"+ people.toString());
		model.addAttribute("peopleList", people);
		System.out.println("######--->"+ scannerName);
		return "scanner-specific";
	}
	
	@GetMapping("/isQualified")
	public String getQualifiedPage(Model model) {
		List<PersonDTO> people = personService.getAllPeopleByQualification("qualified");
		System.out.println("######--->"+ people.toString());
		model.addAttribute("peopleList", people);
		return "qualified";
	}
	
	@GetMapping("/isDisqualified")
	public String getDisqualificationPage(Model model) {
		List<PersonDTO> people = personService.getAllPeopleByQualification("disqualified");
		System.out.println("######--->"+ people.toString());
		model.addAttribute("peopleList", people);
		return "disqualified";
	}
}
