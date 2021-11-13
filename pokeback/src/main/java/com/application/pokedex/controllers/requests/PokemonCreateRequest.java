package com.application.pokedex.controllers.requests;

import com.application.pokedex.models.PokemonGender;
import com.application.pokedex.models.PokemonType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Enumerated;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PokemonCreateRequest {
    private int number;
    private String name;
    private PokemonGender gender;
    private int hp;
    private int atk;
    private int def;
    private int special;
    private int spd;
    private PokemonType pokemonType1;
    private PokemonType pokemonType2;
}
