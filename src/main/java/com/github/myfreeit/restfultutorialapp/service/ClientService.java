package com.github.myfreeit.restfultutorialapp.service;

import com.github.myfreeit.restfultutorialapp.model.Client;

import java.util.List;

public interface ClientService {

    /**
     * Creates new client.
     *
     * @param client client for creates
     */
    void create(Client client);

    /**
     * Returns list all available clients.
     *
     * @return list clients
     */
    List<Client> readAll();

    /**
     * Returns client according to him ID.
     *
     * @param id client ID
     * @return client object with a given ID.
     */
    Client read(int id);

    /**
     * Updates client with a given ID,
     * in accordance with the transferred client.
     *
     * @param client client according to which need to update data
     * @param id     client id which needs to be updated
     * @return {@code true} if data is updated, else {@code false}
     */
    boolean update(Client client, int id);

    /**
     * Deletes a client with a given ID.
     *
     * @param id id of the client who needs to be deleted
     * @return {@code true} if client is removed, else {@code false}
     */
    boolean delete(int id);
}
