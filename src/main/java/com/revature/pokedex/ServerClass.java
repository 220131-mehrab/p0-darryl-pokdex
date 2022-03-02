package com.revature.pokedex;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/** ServerClass will handle each operation related to the HTTP server created for user interaction.
 *
 */

public class ServerClass {
    public ServerClass(){
        // Just the constructor.
    }
    DexRepository dexRepository;
    PokedexService pokedexService = new PokedexService(dexRepository);

    public void BeginServer(){
        DefaultServlet dft = new DefaultServlet();
        Tomcat server = new Tomcat();
        server.setBaseDir("java.io.tmpdir");
        server.setPort(8080);
        server.getConnector();
        server.addContext("",null);
        server.addServlet("", "Default2", dft).addMapping("");
        server.addServlet("", "defaultServlet", new DefaultServlet()).addMapping("/*");
        server.addServlet("", "dexServlet", new DexServlet(pokedexService)).addMapping("/pokemon");
        server.addServlet("","DexML", new DexML()).addMapping("/pokedex");

        try {
            server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}