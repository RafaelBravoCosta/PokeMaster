package com.application.pokedex.controllers;

import com.application.pokedex.controllers.requests.PokemonCreateRequest;
import com.application.pokedex.models.Pokemon;
import com.application.pokedex.services.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokemon")
    public List<Pokemon> getAllPokemon() {
        return pokemonService.findAllPokemon();
    }

    @PostMapping("/pokemon")
    public Pokemon createPokemon(@RequestBody PokemonCreateRequest newPokemon) {
        return pokemonService.createPokemon(
                Pokemon
                        .builder()
                        .number(newPokemon.getNumber())
                        .gender(newPokemon.getGender())
                        .name(newPokemon.getName())
                        .atk(newPokemon.getAtk())
                        .def(newPokemon.getDef())
                        .hp(newPokemon.getHp())
                        .special(newPokemon.getSpecial())
                        .spd(newPokemon.getSpd())
                        .pokemonType1(newPokemon.getPokemonType1())
                        .pokemonType2(newPokemon.getPokemonType2())
                        .build()
        );
    }
}
