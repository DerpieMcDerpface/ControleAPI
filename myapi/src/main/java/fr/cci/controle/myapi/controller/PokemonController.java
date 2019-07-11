package fr.cci.controle.myapi.controller;

import fr.cci.controle.myapi.repository.PokemonRepository;
import fr.cci.controle.myapi.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/pokemon")
public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;
    @Autowired
    private TypeRepository typeRepository;






}
