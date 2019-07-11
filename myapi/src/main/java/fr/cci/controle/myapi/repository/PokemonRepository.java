package fr.cci.controle.myapi.repository;


import fr.cci.controle.myapi.model.Pokemon;
import fr.cci.controle.myapi.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

    Pokemon findById(int id);

    List<Pokemon> findByType(Type type);

}
