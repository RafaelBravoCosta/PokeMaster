package com.application.pokedex.services;

import com.application.pokedex.models.Pokemon;
import com.application.pokedex.repositories.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> findAllPokemon() {
        return pokemonRepository.findAll();
    }

    public Pokemon createPokemon(Pokemon newPokemon) {
        return pokemonRepository.save(newPokemon);
    }
}
