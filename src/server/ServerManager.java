package server;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class ServerManager {
    private HttpServer server;
    private final int port = 8000;

    public ServerManager(SiteRequestHandler handler) throws IOException {
        server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/", handler);
        server.setExecutor(null);
        server.start();
    }


}
