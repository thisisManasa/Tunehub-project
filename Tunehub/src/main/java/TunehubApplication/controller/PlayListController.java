package TunehubApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import TunehubApplication.entites.Playlist;
import TunehubApplication.entites.Songs;
import TunehubApplication.services.PlayListService;
import TunehubApplication.services.SongsService;

@Controller
public class PlayListController 
{
	@Autowired
	PlayListService pserv;
	
	@Autowired
	SongsService sserv;
	
	@GetMapping("/createplaylist")
	public String createPlayList(Model model) {
		
		//Fetching the songs using song service
		List<Songs> songslist=sserv.fetchAllSongs();
		
		//Adding the songs in the model
		model.addAttribute("songslist", songslist);
		
		//Sending createplaylist
		return "createplaylist";
	}
	
	@PostMapping("/addplaylist")
	public String addPlayList(@ModelAttribute Playlist playlist) {
		//System.out.println(playlist);
		
		//adding playlist
		pserv.addPlaylist(playlist);
		
		//update song table
		List<Songs> songsList = playlist.getSongs();
		for(Songs song : songsList) {
			song.getPlaylist().add(playlist);
			sserv.updateSong(song);
		}
		
		return "playlistsuccess";
	}
	
	@GetMapping("/viewPlaylists")
	public String  viewPlaylists(Model model) {
		List<Playlist> plist=pserv.fetchPlaylists();
	//	System.out.println(plist);
		model.addAttribute("plist", plist);
		return "viewplaylist";	
	}	
}


