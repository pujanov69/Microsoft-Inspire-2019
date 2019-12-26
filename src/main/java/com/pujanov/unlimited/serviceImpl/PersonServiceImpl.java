/**
 * 
 */
package com.pujanov.unlimited.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pujanov.unlimited.dao.PersonDAO;
import com.pujanov.unlimited.dto.PersonDTO;
import com.pujanov.unlimited.service.DbService;
import com.pujanov.unlimited.service.PersonService;

/**
 * @author Pujan K.C. <pujanov69@gmail.com>
 *
 * Created on Dec 26, 2019
 */
@Service
public class PersonServiceImpl implements PersonService {

	private DbService dbService;
	
	
	public PersonServiceImpl(DbService dbService) {
		this.dbService = dbService;
	}



	@Override
	public List<PersonDTO> getAllPeople() {
		PersonDAO personDAO = dbService.getDao(PersonDAO.class);
		return personDAO.getAllPeople();
	}



	@Override
	public List<PersonDTO> getAllPeopleByCountry(String country) {
		PersonDAO personDAO = dbService.getDao(PersonDAO.class);
		return personDAO.getAllPeopleByCountry(country);
	}



	@Override
	public List<PersonDTO> getAllPeopleByScanner(String scanner) {
		PersonDAO personDAO = dbService.getDao(PersonDAO.class);
		return personDAO.getAllPeopleByScanner(scanner);
	}



	@Override
	public List<PersonDTO> getAllPeopleByQualification(String qualification) {
		PersonDAO personDAO = dbService.getDao(PersonDAO.class);
		return personDAO.getAllPeopleByQualification(qualification);
	}
}
