package com.revature.pokedex;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class testServ extends HttpServlet {

    private Test test;

    public testServ(Test test) {
        this.test = test;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for (String pokemon : test.getMons()) {
            resp.getWriter().println(pokemon);
        }
    }
}
