package com.revature.pokedex;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DexRepository {
    private List<String> mons;
    private InputStream file;

    public DexRepository(String filename) {
        String encoding = "UTF-8";
        this.mons = new ArrayList<>();
        this.file = getClass().getClassLoader().getResourceAsStream(filename);
        load();
    }

    private void load() {
        Scanner scanner = new Scanner(this.file, "UTF-8");
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            this.mons.add(scanner.next().replaceAll(",", "\t"));

        }
    }

    public List<String> getMons() {
        return mons;
    }

    public String getPokemon(String name) {
        String result = "";
        for (String pokemon: this.mons) {
            if(pokemon.contains(name)) {
                result = pokemon;
            }
        }
        return result;
    }
}