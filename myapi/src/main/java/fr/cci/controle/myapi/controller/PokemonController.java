package fr.cci.controle.myapi.controller;

import fr.cci.controle.myapi.model.PokeType;
import fr.cci.controle.myapi.model.Pokemon;
import fr.cci.controle.myapi.repository.PokemonRepository;
import fr.cci.controle.myapi.repository.PokeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/pokedex/pokemon")
public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;
    @Autowired
    private PokeTypeRepository pokeTypeRepository;


    @GetMapping(path ="/type/{typeId}")
    public String showPokemonByTypeId(@PathVariable int typeId, Model model){
        PokeType pokeType = pokeTypeRepository.findById(typeId);
        List<Pokemon> pokemonList = pokemonRepository.findByPokeType(pokeType);
        model.addAttribute("type", pokeType);
        model.addAttribute("pokemonList", pokemonList);
        return "PokemonPage";
    }



}
