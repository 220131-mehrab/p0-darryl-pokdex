package com.revature.pokedex;

import java.util.List;

public class PokedexService {
    private final DexRepository dexRepository;

    public PokedexService(DexRepository dexRepository) {
        this.dexRepository = dexRepository;
    }

    public String searchForm() {
        return """
                <Html>
                <Head>
                    <Title>Search Pokedex</Title>
                </Head>
                <Body>
                    <h1>Pokedex Search</h1>
                    <form action='pokemon' method='get'>
                        <input type='name' name='searchName'/>
                        <input type='submit' value='Search'/>
                        <a href='pokemon'>See Full Pokedex</a>
                </form>
                </Body>
                </Html>""";
    }

    public List<Pokemon> getPokemon() {
        return dexRepository.getPocketMonsters();
    }

    public Pokemon getPokemon(String userInput) {
        return dexRepository.getPokemon(userInput.trim().toLowerCase());
    }
}