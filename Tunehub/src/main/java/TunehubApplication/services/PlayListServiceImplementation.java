package TunehubApplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TunehubApplication.entites.Playlist;
import TunehubApplication.repositories.PlayListRepository;

@Service
public class PlayListServiceImplementation implements PlayListService
{
	@Autowired
	PlayListRepository prepo;
	
	@Override
	public void addPlaylist(Playlist playlist) {
		prepo.save(playlist);
		
	}

	@Override
	public List<Playlist> fetchPlaylists() {
		return prepo.findAll();
	}
}

