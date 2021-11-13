package com.application.pokedex.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int number;
    private String name;
    @Enumerated
    private PokemonGender gender;
    private int hp;
    private int atk;
    private int def;
    private int special;
    private int spd;
    @Enumerated
    private PokemonType pokemonType1;
    @Enumerated
    private PokemonType pokemonType2;

}
