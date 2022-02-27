package com.revature.pokedex;

import java.util.*;

public class Pokemon implements Comparable<Pokemon>{
    private int dexId;
    private String name;
    private List<Type> types;
    private String sprite;

    //private List<Ability> abilities;
    //private Long baseExperience;
    //private List<Species> forms;
    private Long height;
    //private Boolean isDefault;
    //private List<Move> moves;
    //private Long order;
    //private List<Object> pastTypes;
    //private Species species;
    //private List<Stat> stats;
    private Long weight;

    private Pokemon() {
        this.types = new ArrayList<>();
    }

    public static Pokemon of() {
        return new Pokemon();
    }

    public Pokemon id(int id) {
        this.dexId = id;
        return this;
    }

    public Pokemon name(String name) {
        this.name = name;
        return this;
    }

    public Pokemon sprite(String sprite) {
        this.sprite = sprite;
        return this;
    }

    public Pokemon type1(String type1) {
        types.add(0, Type.valueOf(type1.toUpperCase()));
        return this;
    }

    public Pokemon type2(String type2) {
        try {
            types.add(1, Type.valueOf(type2.toUpperCase()));
        } catch (IllegalArgumentException ex) {}
        return this;
    }

    public int getDexId() {
        return dexId;
    }

    public void setDexId(int dexId) {
        this.dexId = dexId;
    }

    public String getName() {
        return name;
    }

    public String getSprite() {
        return sprite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite + dexId + ".png";
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "<HTML>\n" +
                "<body>\n" + "<h1>"+ "<img src = \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-vi/omegaruby-alphasapphire/" + dexId +".png\" alt =pokemon>" + "\n"
                + dexId + "\n" + name + "\n" + types + "</h1>"
                + "</body>" +
                "</HTML>";
    }

    //URL url = new URL("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-vi/omegaruby-alphasapphire/" + dexId + ".png");
   // BufferedImage c = ImageIO.read(url);
    //ImageIcon image = new ImageIcon(c);
    //jxImageView1.setImage(image);

    public String display() {
        String HTMLForm = "<HTML>\n" +
                "<body>\n" + "<h1>"+ "<img src = sprite alt =pokemon>" + "\n"
        + dexId + "\n" + name + "\n" + types + "</h1>"
                + "</body>" +
                "</HTML>";
        return HTMLForm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return dexId == pokemon.dexId && name.equals(pokemon.name) && types.equals(pokemon.types);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dexId, name, types);
    }

    @Override
    public int compareTo(Pokemon o) {
        return Integer.compare(this.dexId, o.getDexId());
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
}
