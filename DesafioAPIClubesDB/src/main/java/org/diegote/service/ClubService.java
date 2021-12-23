package org.diegote.service;

import java.util.List;

import org.diegote.exception.ClubException;
import org.diegote.model.Club;
import org.diegote.repository.IClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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
		return clubRepository.save(club);
	}

	public void deleteClub(@PathVariable Integer id) throws ClubException {
		if (clubRepository.existsById(id))
			clubRepository.deleteById(id);
		else
			throw new ClubException("No existe el club con id: " + id);
	}

	public Club updateClub(Club club) throws ClubException {
		if(club.getId()==null)
			throw new ClubException("El ID del Club no puede ser nulo. Agregar al Body el ID del Club");
		
		if (clubRepository.existsById(club.getId()))
			return clubRepository.save(club);
		else
			throw new ClubException("No existe el club con id: " + club.getId());
	}

	public Club getClubById(Integer id) throws ClubException {
		if (clubRepository.existsById(id))
			return clubRepository.getById(id);
		else
			throw new ClubException("No existe el club con el id: " + id);
	}

	public List<Club> getClubByName(String nombre) {
		return clubRepository.findByNombre(nombre);
	}

	public List<Club> filterTop3TitulosNacionales() {
		return clubRepository.filterTop3TitulosNacionales(PageRequest.of(0, 3));
	}

	public List<Club> filterTop3TitulosInternacionales() {
		return clubRepository.filterTop3TitulosInternacionales(PageRequest.of(0, 3));
	}

	public List<Club> filterByPais(String pais) {
		return clubRepository.filterByPais(pais);
	}

	public List<Club> filterByMasTitulos() {
		return clubRepository.filterTop3MasTitulos(PageRequest.of(0, 3));
	}

}
