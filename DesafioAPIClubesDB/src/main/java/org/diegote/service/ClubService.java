package org.diegote.service;

import java.util.List;
import java.util.Optional;

import org.diegote.model.Club;
import org.diegote.model.Estadio;
import org.diegote.repository.IClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class ClubService {

	@Autowired
	private final IClubRepository clubRepository;

	public ClubService(IClubRepository clubRepository) {
		this.clubRepository = clubRepository;
	}

	public List<Club> getClubes() {
		return clubRepository.findAll();
	}

	public Club addClub(Club club) {
		System.out.println(club);
		return clubRepository.save(club);
	}

	public void deleteClub(@PathVariable Integer id) {
		clubRepository.deleteById(id);
	}

	public Club updateClub(Club club) {
		return clubRepository.save(club);

	}

}
