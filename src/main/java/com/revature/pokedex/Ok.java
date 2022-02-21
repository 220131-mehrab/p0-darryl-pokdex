package com.revature.pokedex;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Ok {
    public static void main(String[] args) {
        Test test = new Test("https://pokeapi.co/api/v2/pokemon?limit=151");
        testServ serv = new testServ(test);
        SearchFormService sf = new SearchFormService();

        Tomcat server = new Tomcat();
        server.setBaseDir(System.getProperty("java.io.tmpdir"));
        server.getConnector();
        server.addContext("", null);
        server.addServlet("", "testServer", serv).addMapping("/pokemon");
        server.addServlet("", "searchFormServlet", sf).addMapping("/search");
        try {
            server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
