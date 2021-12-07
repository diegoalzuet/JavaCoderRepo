package org.diegote.service;

import java.util.List;
import java.util.Optional;

import org.diegote.model.Club;
import org.diegote.model.Estadio;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class ClubService {

	private List<Club> clubes;

	public ClubService(List<Club> clubes) {
		this.clubes = clubes;
	}

	public Club getElMasGrande() {
		Club river = new Club(1, "River Plate", "El Millonario", 100000, 50, 18,
				new Estadio(1, "Estadio Monumental", 60000, false), "Marcelo Gallardo");
		this.clubes.add(river);
		return river;
	}

	public Club addClub(Club club) {
		this.clubes.add(club);
		return club;
	}

	public List<Club> getClubes() {
		// TODO Auto-generated method stub
		return this.clubes;
	}

	@DeleteMapping("/deleteClub/{id}")
	public boolean deleteClub(@PathVariable Integer id) {

		for (Club club : this.clubes) {
			if (club.getId().equals(id)) {
				this.clubes.remove(club);
				return true;
			}
		}
		return false;
	}

	public Optional<Club> updateClub(Club club, Integer id) {
		for (Club c : this.clubes) {
			if (c.getId().equals(id)) {
				this.clubes.remove(c);
				this.clubes.add(club);
				return Optional.ofNullable(club);
			}

		}
		return null;
	}
}
