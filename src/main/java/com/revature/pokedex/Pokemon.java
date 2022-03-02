package com.revature.pokedex;

import java.util.*;

 public class Pokemon {
    private int id, hp, atk, def, spAtk, spDef, spd;
    //private float ht, wt;
    private String name, species, type1, type2, ht, wt;

    public Pokemon(int id, String name, String type1, String type2, int hp, int atk, int def, int spAtk, int spDef, int spd, String species, String ht, String wt){
        this.id = id;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.spd = spd;
        this.species = species;
        this.ht = ht;
        this.wt = wt;
    }

    public Pokemon() { }
    // Used when just declaring/initializing a variable.

    public static Pokemon builder(){
        return new Pokemon();
    }

    @Override
    public String toString() {
        return display();
    }

    public int getId() {
        return id;
    }

    public Pokemon id(int id) {
        this.id = id;
        return this;
    }

    public int getHp() {
        return hp;
    }

    public Pokemon hp(int hp) {
        this.hp = hp;
        return this;
    }

    public int getAtk() {
        return atk;
    }

    public Pokemon atk(int atk) {
        this.atk = atk;
        return this;
    }

    public int getDef() {
        return def;
    }

    public Pokemon def(int def) {
        this.def = def;
        return this;
    }

    public int getspAtk() {
        return spAtk;
    }

    public Pokemon spAtk(int spAtk) {
        this.spAtk = spAtk;
        return this;
    }

    public int getspDef() {
        return spDef;
    }

    public Pokemon spDef(int spDef) {
        this.spDef = spDef;
        return this;
    }

    public int getSpd() {
        return spd;
    }

    public Pokemon spd(int spd) {
        this.spd = spd;
        return this;
    }

    public String getName() {
        return name;
    }

    public Pokemon name(String name) {
        this.name = name;
        return this;
    }

    public String getHeight() {
        return ht;
    }

    public Pokemon height(String ht) {
        this.ht = ht;
        return this;
    }

    public String getWeight() {
        return wt;
    }

    public Pokemon weight(String wt) {
        this.wt = wt;
        return this;
    }

    public String getType1() {
        return type1;
    }

    public Pokemon type1(String type1) {
        this.type1 = type1;
        return this;
    }

    public String getType2() {
        return type2;
    }

    public Pokemon type2(String type2) {
        this.type2 = type2;
        return this;
    }

    public String getSpecies() {
        return species;
    }

    public Pokemon species(String species) {
        this.species = species;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return id == pokemon.id && name.equals(pokemon.name) && type1.equals(pokemon.type1) && type2.equals(pokemon.type2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type1, type2);
    }

    //@Override
    public int compareTo(Pokemon o) {
        return Integer.compare(this.id, o.getId());
    }

    public String display() {
         return "<!DOCTYPE html>"+
"<html lang=\"en\">"+
"<head>"+
    "<!-- Required meta tags -->"+
    "<meta charset=\"utf-8\">"+
    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"+

    "<!-- Bootstrap CSS -->"+
"<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">"
+ "<!-- Bootstrap Bundle with Popper --> "
            + "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>" +
    "<title>Pokemon You Searched</title>"+
"</head>"+
"<body>"+

"<div class=\"card\" style=\"width: 18rem;\">"+
    "<img src= \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-viii/icons/" + id + ".png\" class=\"card-img-top\" alt=\"pokemon\">" +
    "<div class=\"card-body\">"+
        "<h5 class=\"card-title\" id=\"name\">" + name + "</h5>"+
        "<p class=\"card-text\">" + id + "\n" + type1 + "\n" + type2 + "</p>"+
        "<a href=\"pokemon\" class=\"btn btn-primary\">View Pokemon</a>"+
    "</div>"+
"</div>"+
"</body>"+
"</html>";

     }
}
