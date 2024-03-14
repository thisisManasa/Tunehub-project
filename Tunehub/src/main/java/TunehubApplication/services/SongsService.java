package TunehubApplication.services;

import java.util.List;

import TunehubApplication.entites.Songs;

public interface SongsService 
{
	public String addSongs(Songs song);
	
	public boolean songExists(String name);
	
	public List<Songs> fetchAllSongs();

	public void updateSong(Songs song);

}
