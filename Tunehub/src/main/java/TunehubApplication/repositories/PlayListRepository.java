package TunehubApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import TunehubApplication.entites.Playlist;

public interface PlayListRepository extends JpaRepository<Playlist, Integer>
{

}
