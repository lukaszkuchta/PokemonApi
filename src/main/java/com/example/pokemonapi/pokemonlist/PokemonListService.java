package com.example.pokemonapi.pokemonlist;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonListService {
    private final FetchPokemonListUseCase pokemonListUseCase;

    public PokemonListService(FetchPokemonListUseCase pokemonListUseCase) {
        this.pokemonListUseCase = pokemonListUseCase;
    }

    List<PokemonListItemEntity> getPokemonItemList() {
        return pokemonListUseCase.execute();
    }
}
