package com.revature.pokedex;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DexService extends HttpServlet {
    private DexRepository dexRepository;

    public DexService(DexRepository dexRepository) {
        this.dexRepository = dexRepository;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userInput;
        userInput = req.getParameter("searchName");

        if (userInput!= null){
            String result = dexRepository.getPokemon(userInput);
            resp.getWriter().println(dexRepository.getPokemon(userInput));
        } else {
            for (String pokemon : dexRepository.getMons()) {
                resp.getWriter().println(pokemon);
            }
        }
    }
}
