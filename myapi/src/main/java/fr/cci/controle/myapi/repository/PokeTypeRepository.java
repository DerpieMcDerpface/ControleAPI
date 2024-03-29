package fr.cci.controle.myapi.repository;


import fr.cci.controle.myapi.model.PokeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokeTypeRepository extends JpaRepository<PokeType, Integer> {

    PokeType findById(int id);

}
