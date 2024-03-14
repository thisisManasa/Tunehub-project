package TunehubApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import TunehubApplication.entites.Songs;

public interface SongsRepository extends JpaRepository<Songs, Integer> 
{
	public Songs findByName(String name);
	

}
