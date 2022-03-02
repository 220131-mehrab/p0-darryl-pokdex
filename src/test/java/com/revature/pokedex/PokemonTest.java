package com.revature.pokedex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

class PokemonTest {
    DexRepository testRepo;
    Pokemon pokemon = new Pokemon();
    List<Pokemon> actual;


    @BeforeEach
    void setUp() {
        testRepo = new CSVDexRepository("./pokedex.csv");
        actual = testRepo.getPocketMonsters();
    }

    @Test
    void builder() {
    }
    //did not test

    @Test
    void testToString() {
    }
    //did not test

    @Test
    void getId() {
        pokemon.id(actual.get(0).getId()); //I originally began hard coding these("pokemon.id(1)"), but figured I should be testing the getters against what is set
        Assertions.assertEquals(pokemon.getId(), actual.get(0).getId());
    }

    @Test
    void id() {
        Assertions.assertEquals(1, actual.get(0).getId());
    }

    @Test
    void getHp() {
        pokemon.hp(actual.get(0).getHp());
        Assertions.assertEquals(pokemon.getHp(), actual.get(0).getHp());
    }

    @Test
    void hp() {
        Assertions.assertEquals(45, actual.get(0).getHp());
    }

    @Test
    void getAtk() {
        pokemon.atk(actual.get(0).getAtk());
        Assertions.assertEquals(pokemon.getAtk(), actual.get(0).getAtk());
    }

    @Test
    void atk() {
        Assertions.assertEquals(49, actual.get(0).getAtk());
    }

    @Test
    void getDef() {
        pokemon.def(actual.get(0).getDef());
        Assertions.assertEquals(pokemon.getDef(), actual.get(0).getDef());
    }

    @Test
    void def() {
        Assertions.assertEquals(49, actual.get(0).getDef());
    }

    @Test
    void getspAtk() {
        pokemon.spAtk(actual.get(0).getspAtk());
        Assertions.assertEquals(pokemon.getspAtk(), actual.get(0).getspAtk());
    }

    @Test
    void spAtk() {
        Assertions.assertEquals(65, actual.get(0).getspAtk());
    }

    @Test
    void getspDef() {
        pokemon.spDef(actual.get(0).getspDef());
        Assertions.assertEquals(pokemon.getspDef(), actual.get(0).getspDef());
    }

    @Test
    void spDef() {
        Assertions.assertEquals(65, actual.get(0).getspDef());
    }

    @Test
    void getSpd() {
        pokemon.spd(actual.get(0).getSpd());
        Assertions.assertEquals(pokemon.getSpd(), actual.get(0).getSpd());
    }

    @Test
    void spd() {
        Assertions.assertEquals(45, actual.get(0).getSpd());
    }

    @Test
    void getName() {
        pokemon.name(actual.get(0).getName());
        Assertions.assertEquals(pokemon.getName(), actual.get(0).getName());
    }

    @Test
    void name() {
        Assertions.assertEquals("Bulbasaur", actual.get(0).getName());
    }

    @Test
    void getHeight() {
        pokemon.height(actual.get(0).getHeight());
        Assertions.assertEquals(pokemon.getHeight(), actual.get(0).getHeight());
    }

    @Test
    void height() {
        Assertions.assertEquals("0.7 m", actual.get(0).getHeight());
    }

    @Test
    void getWeight() {
        pokemon.weight(actual.get(0).getWeight());
        Assertions.assertEquals(pokemon.getWeight(), actual.get(0).getWeight());
    }

    @Test
    void weight() {
        Assertions.assertEquals("6.9 kg", actual.get(0).getWeight());
    }

    @Test
    void getType1() {
        pokemon.type1(actual.get(0).getType1());
        Assertions.assertEquals(pokemon.getType1(), actual.get(0).getType1());
    }

    @Test
    void type1() {
        Assertions.assertEquals("Grass", actual.get(0).getType1());
    }

    @Test
    void getType2() {
        pokemon.type2(actual.get(0).getType2());
        Assertions.assertEquals(pokemon.getType2(), actual.get(0).getType2());
    }

    @Test
    void type2() {
        Assertions.assertEquals("Poison", actual.get(0).getType2());
    }

    @Test
    void getSpecies() {
        pokemon.species(actual.get(0).getSpecies());
        Assertions.assertEquals(pokemon.getSpecies(), actual.get(0).getSpecies());
    }

    @Test
    void species() {
        pokemon.species(actual.get(0).getSpecies());
        Assertions.assertEquals(pokemon.getSpecies(), actual.get(0).getSpecies()); //Not gonna even try to get around this spelling
    }

    @Test
    void testEquals() {
    }
    //No need to test a test

    @Test
    void testHashCode() {
    }
    //???

    @Test
    void compareTo() {
    }
    //A copy of the getId test

    @Test
    void display() {
    }
    //html
}