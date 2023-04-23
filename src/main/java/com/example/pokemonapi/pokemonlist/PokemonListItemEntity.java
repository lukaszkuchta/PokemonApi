package com.example.pokemonapi.pokemonlist;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class PokemonListItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String pokemonDetailsUrl;

    public PokemonListItemEntity() {
    }

    public PokemonListItemEntity(String name, String pokemonDetailsUrl) {
        this.id = id;
        this.name = name;
        this.pokemonDetailsUrl = pokemonDetailsUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPokemonDetailsUrl() {
        return pokemonDetailsUrl;
    }

    public void setPokemonDetailsUrl(String pokemonDetailsUrl) {
        this.pokemonDetailsUrl = pokemonDetailsUrl;
    }
}
