package com.nour.demo.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nour.demo.entities.album;
import com.nour.demo.entities.chanson;


public interface chansonService {
	chanson saveChanson(chanson p);
	chanson updateChanson(chanson p);
	void deleteChanson(chanson p);
	 void deleteChansonById(Long id);
	 chanson getChanson(Long id);
	List<chanson> getAllChansons();
	Page<chanson> getAllChansonsParPage(int page, int size);
	List<chanson> findByAlbum (album album);
	List<chanson> findByAlbumIdAlbum(Long idChanson);

}
