package com.application.pokedex.controllers.responses;

import com.application.pokedex.models.PokemonGender;
import com.application.pokedex.models.PokemonType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PokemonResponse {

    private Long id;
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
