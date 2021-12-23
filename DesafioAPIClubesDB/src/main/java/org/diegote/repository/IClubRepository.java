package org.diegote.repository;

import java.util.List;

import org.diegote.model.Club;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IClubRepository extends JpaRepository<Club,Integer> {
	
	@Query("SELECT c FROM Club c WHERE c.nombre LIKE %:nombre%")
	List<Club> findByNombre(@Param("nombre") String nombre);
	
	
	@Query ("SELECT c FROM  Club c ORDER BY c.titulosNacionales DESC")
	List<Club> filterTop3TitulosNacionales(PageRequest pageRequest);

	@Query ("SELECT c FROM  Club c ORDER BY c.titulosInternacionales DESC")
	List<Club> filterTop3TitulosInternacionales(PageRequest of);

	@Query("SELECT c FROM Club c WHERE c.pais LIKE :pais")
	List<Club> filterByPais(@Param("pais") String pais);

	@Query ("SELECT c FROM  Club c ORDER BY c.titulosInternacionales + c.titulosNacionales DESC")
	List<Club> filterTop3MasTitulos(PageRequest of);
	
//	@Query("select case when count(c)> 0 then true else false end from Club c where c.nombre like %:nombre%")
//	boolean existsClubLikeCustomQuery(@Param("nombre") String nombre);
	

}
