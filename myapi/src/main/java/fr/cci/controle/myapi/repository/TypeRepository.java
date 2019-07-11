package fr.cci.controle.myapi.repository;


import fr.cci.controle.myapi.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<Type, Integer> {

    Type findById(int id);

}
