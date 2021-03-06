package org.diegote.controller;

import java.util.List;

import org.diegote.model.Club;
import org.diegote.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ClubController {
	
	@Autowired
	private final ClubService clubService;
	
	public ClubController(ClubService clubService) {
		this.clubService = clubService;		
	}
	
	@GetMapping("/elmasgrande")
	public Club getClub() {
		return clubService.getElMasGrande();
				
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
	public boolean deleteClub(@PathVariable Integer id) {
		return clubService.deleteClub(id);
	}
	@PutMapping("/updateClub/{id}")
	public Club updateClub(@RequestBody Club club, @PathVariable Integer id) {
		
		return (clubService.updateClub(club,id))
				.orElseThrow(() -> new RuntimeException(""));
	}
	

}
