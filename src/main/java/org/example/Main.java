package org.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.*;

public class Main {
    public static void main(String[] args) throws Exception {
        var webapp = new WebAppContext();
        webapp.setResourceBase("src/main/webapp");
        webapp.setContextPath("/");
        webapp.setAttribute("org.eclipse.jetty.server.webapp.ContainerIncludeJarPattern", ".*/classes/.*");
        var server = new Server(8080);
        server.setHandler(webapp);
        server.start();
        server.join();
    }

}
