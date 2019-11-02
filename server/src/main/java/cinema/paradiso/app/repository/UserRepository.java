package cinema.paradiso.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cinema.paradiso.app.model.user.SecurityUser;

@Repository
public interface UserRepository extends JpaRepository<SecurityUser, Long>{

	public SecurityUser findByUsername(String username);
}
