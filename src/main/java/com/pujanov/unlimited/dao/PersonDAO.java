/**
 * 
 */
package com.pujanov.unlimited.dao;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

import com.pujanov.unlimited.dto.PersonDTO;

/**
 * @author Pujan K.C. <pujanov69@gmail.com>
 *
 * Created on Dec 26, 2019
 */
public interface PersonDAO {

	@SqlQuery("SELECT * FROM persons")
	public List<PersonDTO> getAllPeople();
	
	@SqlQuery("SELECT * FROM persons WHERE country_id = :country")
	public List<PersonDTO> getAllPeopleByCountry(@Bind("country") String country);
	
	@SqlQuery("SELECT * FROm persons WHERE scanned_by = :scanner")
	public List<PersonDTO> getAllPeopleByScanner(@Bind("scanner") String scanner);
	
	@SqlQuery("SELECT * FROm persons WHERE qualified_disqualified = :qualification")
	public List<PersonDTO> getAllPeopleByQualification(@Bind("qualification") String qualification);
}
