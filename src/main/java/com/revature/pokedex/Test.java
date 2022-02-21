package com.revature.pokedex;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    private InputStream input;
    private List<String> mons;

    public Test(String args){
        try {
            this.mons = new ArrayList();
            this.input = new URL("https://pokeapi.co/api/v2/pokemon").openStream();
            load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void load() {
        Scanner scanner = new Scanner(this.input);
        scanner.useDelimiter(";");
        while (scanner.hasNext()) {
            this.mons.add(scanner.next().replaceAll(",+", "\n").replaceAll("url", "\n"));
        }
    }

    public List<String> getMons() {
        return mons;
    }
}
