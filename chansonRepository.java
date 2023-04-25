package com.nour.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nour.demo.entities.album;
import com.nour.demo.entities.chanson;
@RepositoryRestResource(path = "rest")
public interface chansonRepository extends JpaRepository<chanson,Long>{
	@Query("select c from chanson c where c.album = ?1")
	List<chanson> findByAlbum (album album);
	List<chanson> findByAlbumIdalbum(Long id);

	

	


}
