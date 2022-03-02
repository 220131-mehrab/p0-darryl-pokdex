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


    //Sprites.java
    public class Sprites {
        private String backDefault;
        private Object backFemale;
        private String backShiny;
        private Object backShinyFemale;
        private String frontDefault;
        private Object frontFemale;
        private String frontShiny;
        private Object frontShinyFemale;
        private Other other;
        private Sprites animated;

        public String getBackDefault() { return backDefault; }
        public void setBackDefault(String value) { this.backDefault = value; }

        public Object getBackFemale() { return backFemale; }
        public void setBackFemale(Object value) { this.backFemale = value; }

        public String getBackShiny() { return backShiny; }
        public void setBackShiny(String value) { this.backShiny = value; }

        public Object getBackShinyFemale() { return backShinyFemale; }
        public void setBackShinyFemale(Object value) { this.backShinyFemale = value; }

        public String getFrontDefault() { return frontDefault; }
        public void setFrontDefault(String value) { this.frontDefault = value; }

        public Object getFrontFemale() { return frontFemale; }
        public void setFrontFemale(Object value) { this.frontFemale = value; }

        public String getFrontShiny() { return frontShiny; }
        public void setFrontShiny(String value) { this.frontShiny = value; }

        public Object getFrontShinyFemale() { return frontShinyFemale; }
        public void setFrontShinyFemale(Object value) { this.frontShinyFemale = value; }

        public Other getOther() { return other; }
        public void setOther(Other value) { this.other = value; }

        public Sprites getAnimated() { return animated; }
        public void setAnimated(Sprites value) { this.animated = value; }
    }

    // Other.java
    public class Other {
        private Home home;
        private OfficialArtwork officialArtwork;

        public Home getHome() { return home; }
        public void setHome(Home value) { this.home = value; }

        public OfficialArtwork getOfficialArtwork() { return officialArtwork; }
        public void setOfficialArtwork(OfficialArtwork value) { this.officialArtwork = value; }
    }

// OfficialArtwork.java
    public class OfficialArtwork {
        private String frontDefault;

        public String getFrontDefault() { return frontDefault; }
        public void setFrontDefault(String value) { this.frontDefault = value; }
    }

// Stat.java
    public class Stat {
        private Long baseStat;
        private Long effort;
        private Species stat;

        public Long getBaseStat() { return baseStat; }
        public void setBaseStat(Long value) { this.baseStat = value; }

        public Long getEffort() { return effort; }
        public void setEffort(Long value) { this.effort = value; }

        public Species getStat() { return stat; }
        public void setStat(Species value) { this.stat = value; }
    }

// Home.java
    public class Home {
        private String frontDefault;
        private Object frontFemale;
        private String frontShiny;
        private Object frontShinyFemale;

        public String getFrontDefault() { return frontDefault; }
        public void setFrontDefault(String value) { this.frontDefault = value; }

        public Object getFrontFemale() { return frontFemale; }
        public void setFrontFemale(Object value) { this.frontFemale = value; }

        public String getFrontShiny() { return frontShiny; }
        public void setFrontShiny(String value) { this.frontShiny = value; }

        public Object getFrontShinyFemale() { return frontShinyFemale; }
        public void setFrontShinyFemale(Object value) { this.frontShinyFemale = value; }
    }

// Species.java
    public class Species {
        private String name;
        private String url;

        public String getName() { return name; }
        public void setName(String value) { this.name = value; }

        public String getURL() { return url; }
        public void setURL(String value) { this.url = value; }
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
        "<h5 class=\"card-title\" id=\"name\">This is where the name should go</h5>"+
        "<p class=\"card-text\">This is where dexId, name, and types are supposed to be</p>"+
        "<a href=\"pokemon\" class=\"btn btn-primary\">View Pokemon</a>"+
    "</div>"+
"</div>"+
"</body>"+
"</html>";

     }
}
