package com.revature.pokedex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;

class CSVDexRepositoryTest {
    DexRepository testRepo;

    @BeforeEach
    void setUp() {
        testRepo = new CSVDexRepository("./pokedex.csv");
    }

    @Test
    void getPocketMonsters() {
        List<Pokemon> actual = testRepo.getPocketMonsters();
        Assertions.assertEquals("Bulbasaur", actual.get(0).getName());
    }

    @Test
    void getPokemon() {
        Pokemon actual = testRepo.getPokemon("Bulbasaur");
        Assertions.assertEquals("Bulbasaur", actual.getName());
    }
}