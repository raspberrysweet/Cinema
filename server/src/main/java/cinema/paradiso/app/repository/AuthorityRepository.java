package cinema.paradiso.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cinema.paradiso.app.model.user.SecurityAuthority;


// original nema komponent 
@Repository
public interface AuthorityRepository extends JpaRepository<SecurityAuthority, Long>{
	SecurityAuthority findByName(String name);
}
