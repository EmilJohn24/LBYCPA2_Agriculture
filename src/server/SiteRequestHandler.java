package server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Queue;

public class SiteRequestHandler implements HttpHandler {
    private HashMap<Integer, HttpExchange> exchanges;

    @Override
    public void handle(HttpExchange exchange) throws IOException {

    }
}
