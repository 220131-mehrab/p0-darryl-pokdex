package com.revature.pokedex;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) {
        String webAppName = "pokedex";
        DexRepository dexRepository = new DexRepository("pokedex.csv");
        DexService dexService = new DexService(dexRepository);
        SearchFormService sf = new SearchFormService();

        Tomcat server = new Tomcat();
        server.setBaseDir(System.getProperty("java.io.tmpdir"));
        //server.serPort(0);
        server.getConnector();
        server.addContext(webAppName, null);
        server.addServlet(webAppName, "defaultServlet", new DefaultServlet()).addMapping("/");
        server.addServlet(webAppName, "dexServlet", dexService).addMapping("/pokemon");
        server.addServlet(webAppName, "searchFormServlet", sf).addMapping("/search");
        //System.out.println("server running on http://localhost:" + server.getConnector().getPort());
        try {
            server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
