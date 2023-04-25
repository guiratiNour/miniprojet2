package com.nour.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nour.demo.entities.album;
import com.nour.demo.entities.chanson;
import com.nour.demo.repos.chansonRepository;
@Service
public class chansonServiceImpl implements chansonService{
	@Autowired
	chansonRepository chansonRepository;

	@Override
	public chanson saveChanson(chanson p) {
		
		return chansonRepository.save(p);
	}

	@Override
	public chanson updateChanson(chanson p) {
		
		return chansonRepository.save(p);
	}

	@Override
	public void deleteChanson(chanson p) {
		chansonRepository.delete(p);
		
	}

	@Override
	public void deleteChansonById(Long id) {
		chansonRepository.deleteById(id);
		
	}

	@Override
	public chanson getChanson(Long id) {
		
		return chansonRepository.findById(id).get();
	}

	@Override
	public List<chanson> getAllChansons() {
		
		return chansonRepository.findAll();
	}

	@Override
	public Page<chanson> getAllChansonsParPage(int page, int size) {
		
		return chansonRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<chanson> findByAlbum(album album) {
		
		return chansonRepository.findByAlbum(album);
	}

	@Override
	public List<chanson> findByAlbumIdAlbum(Long id) {
		
		return chansonRepository.findByAlbumIdalbum(id);
	}

}
