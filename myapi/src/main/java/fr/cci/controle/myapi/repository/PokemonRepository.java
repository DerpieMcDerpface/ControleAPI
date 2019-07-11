package fr.cci.controle.myapi.repository;


import fr.cci.controle.myapi.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

    Pokemon findById(int id);
}
