package com.app.server.service;

import com.app.server.model.Server;

import java.io.IOException;
import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Collection<Server> getServers(int limit);
    Server get(Long id);
    Server ping(String ipAddress) throws IOException;
    Server update(Server server);
    Boolean delete(Long id);
}
