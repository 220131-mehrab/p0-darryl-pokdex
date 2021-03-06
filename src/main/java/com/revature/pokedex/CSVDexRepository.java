package com.revature.pokedex;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * CSVDexRepository is a CSV Reader specialized for importing Pokemon data in a known format:
 * ID,Number,Name,Type1,Type2,Total,HP,Atk,Def,SpAtk,SpDef,Spd,Species,Height,Weight
 */
public class CSVDexRepository implements DexRepository{
    private List<Pokemon> pocketMonsters;
    private InputStream file;

    /**
     * Constructor requiring path to CSV file
     * @param filename CSV File to parse
     */
    public CSVDexRepository(String filename) {
        this.pocketMonsters = new ArrayList<>();
        this.file = getClass().getClassLoader().getResourceAsStream(filename);
        load();
    }

    /**
     * load is a utility method for scanning and parsing a pokedex CSV.
     */
    private void load() {
        Scanner scanner = new Scanner(this.file);
        scanner.useDelimiter("\n");
        scanner.next();
        while (scanner.hasNext()) {
            String[] pokeColumns = scanner.next().split(",");
            Pokemon temp = Pokemon.builder().name(pokeColumns[2])
                    .id(Integer.parseInt(pokeColumns[1]))
                    .type1(pokeColumns[3])
                    .type2(pokeColumns[4])
                    .hp(Integer.parseInt(pokeColumns[6]))
                    .atk(Integer.parseInt(pokeColumns[7]))
                    .def(Integer.parseInt(pokeColumns[8]))
                    .spAtk(Integer.parseInt(pokeColumns[9]))
                    .spDef(Integer.parseInt(pokeColumns[10]))
                    .spd(Integer.parseInt(pokeColumns[11]))
                    .species(pokeColumns[12])
                    .height(pokeColumns[13])
                    .weight(pokeColumns[14]);

            this.pocketMonsters.add(temp);
        }
    }

    public List<Pokemon> getPocketMonsters() {
        return pocketMonsters;
    }

    public Pokemon getPokemon(String name) {
        Pokemon result = null;
        for (Pokemon pokemon : this.pocketMonsters) {
            if (pokemon.getName().equalsIgnoreCase(name)) {
                result = pokemon;
            }
        }
        return result;
    }
}