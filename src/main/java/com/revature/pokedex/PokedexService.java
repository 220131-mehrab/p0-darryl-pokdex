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
                <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                                
                    <!-- Bootstrap CSS -->
                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
                                
                    <!-- Bootstrap Bundle with Popper -->
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
                                
                                
                    <Title>Search Bar</Title>
                </Head>
                <Body>
                    <h5>Pokedex Search</h5>
                    <div>
                    <form action='pokemon' method='get'>
                        <input type='name' name='searchName'/><button class="btn btn-primary" type="submit" >Search</button>
                        <button class="btn btn-primary" type="button"><a href="pokemon" class="btn btn-lg">View Full Pokedex</a></button>
                        </div>
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