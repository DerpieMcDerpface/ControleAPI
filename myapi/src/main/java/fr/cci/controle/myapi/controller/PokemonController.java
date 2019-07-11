package fr.cci.controle.myapi.controller;

import fr.cci.controle.myapi.model.Pokemon;
import fr.cci.controle.myapi.model.Type;
import fr.cci.controle.myapi.repository.PokemonRepository;
import fr.cci.controle.myapi.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(path = "/pokedex/pokemon")
public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;
    @Autowired
    private TypeRepository typeRepository;


    @GetMapping(path ="/type/{typeId}")
    public String showPokemonByTypeId(@PathVariable int typeId, Model model){
        Type type = typeRepository.findById(typeId);
        List<Pokemon> pokemonList = pokemonRepository.findByType(type);
        model.addAttribute("type", type);
        model.addAttribute("pokemonList", pokemonList);
        return "PokemonPage";
    }



}
