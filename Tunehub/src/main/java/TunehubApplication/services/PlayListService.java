package TunehubApplication.services;

import java.util.List;

import TunehubApplication.entites.Playlist;

public interface PlayListService 
{

	public void addPlaylist(Playlist playlist);

	public List<Playlist> fetchPlaylists();

}
