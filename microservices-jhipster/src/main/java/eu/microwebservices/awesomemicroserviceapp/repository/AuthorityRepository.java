package eu.microwebservices.awesomemicroserviceapp.repository;

import eu.microwebservices.awesomemicroserviceapp.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
