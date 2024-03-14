package TunehubApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import TunehubApplication.entites.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>
{
	public Users findByEmail(String email); 
}
