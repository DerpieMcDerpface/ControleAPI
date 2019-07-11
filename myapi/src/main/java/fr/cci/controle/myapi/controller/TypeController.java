package fr.cci.controle.myapi.controller;


import fr.cci.controle.myapi.repository.PokemonRepository;
import fr.cci.controle.myapi.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/pokedex/type")
public class TypeController {

    @Autowired
    private PokemonRepository pokemonRepository;
    @Autowired
    private TypeRepository typeRepository;


    @GetMapping(path ="/all")
    public String showAllType(Model model){
        model.addAttribute("typeList", typeRepository.findAll());
        return "TypePage";
    }



}
