package fr.cci.controle.myapi.controller;

import fr.cci.controle.myapi.repository.PokemonRepository;
import fr.cci.controle.myapi.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/pokedex/pokemon")
public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;
    @Autowired
    private TypeRepository typeRepository;


    @GetMapping(path ="/type/{id}")
    public String showPokemonByTypeId(@RequestParam int typeId){

        return "PokemonPage";
    }



}
