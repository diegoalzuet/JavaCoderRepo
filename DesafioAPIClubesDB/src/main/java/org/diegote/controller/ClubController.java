package org.diegote.controller;

import java.util.List;

import org.diegote.exception.ClubException;
import org.diegote.model.Club;
import org.diegote.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("apiClub/v1")
@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class ClubController {
	
	@Autowired
	private final ClubService clubService;
	
	public ClubController(ClubService clubService) {
		this.clubService = clubService;		
	}
	@GetMapping("/getClubes")
	public List<Club> getClubes(){
		return clubService.getClubes();
	}
	
	@PostMapping("/addClub")
	public Club addClub(@RequestBody Club club) {
		return clubService.addClub(club);
	}
	
	@DeleteMapping("/deleteClub/{id}")
	public void deleteClub(@PathVariable Integer id) {
		try {
			clubService.deleteClub(id);
		} catch (Exception e) {			
//			e.printStackTrace();
			System.err.println(e.getMessage());
		}		
	}	

	@PutMapping("/updateClub")
	public Club updateClub(@RequestBody Club club) {	
		
		try {
			return clubService.updateClub(club);		
		}catch(ClubException e) {
			System.err.println(e.getMessage());	
		}
		return null;
	}	
	
	@GetMapping("/getClubById/{id}")
	public Club getClubById(@PathVariable Integer id) {
		try {
			return clubService.getClubById(id);
		} catch (ClubException e) {					
			System.err.println(e.getMessage());			
		}
		return null;		
	}
	
	@GetMapping("/getClubByName/{nombre}")
	public List<Club> getClubByName(@PathVariable String nombre) {
		return clubService.getClubByName(nombre);
	}
	
	@GetMapping("/Top3TitulosNacionales")
	public List<Club> filterByTitulosNacionales(){
		return clubService.filterTop3TitulosNacionales();
	}
	@GetMapping("/Top3TitulosInternacionales")
	public List<Club> filterByTitulosInternacionales(){
		return clubService.filterTop3TitulosInternacionales();
	}
	@GetMapping("/Top3MasTitulos")
	public List<Club> filterByMasTitulos(){
		return clubService.filterByMasTitulos();
	}
	@GetMapping("/filterByPais/{pais}")
	public List<Club> filterByPais(@PathVariable String pais){
		return clubService.filterByPais(pais);
	}


}
