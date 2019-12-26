/**
 * 
 */
package com.pujanov.unlimited.service;

import java.util.List;

import com.pujanov.unlimited.dto.PersonDTO;

/**
 * @author Pujan K.C. <pujanov69@gmail.com>
 *
 * Created on Dec 26, 2019
 */
public interface PersonService {

	public List<PersonDTO> getAllPeople();
	public List<PersonDTO> getAllPeopleByCountry(String country);
	public List<PersonDTO> getAllPeopleByScanner(String scanner);
	public List<PersonDTO> getAllPeopleByQualification(String qualification);
}
