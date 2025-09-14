package com.github.myfreeit.restfultutorialapp.service;

import com.github.myfreeit.restfultutorialapp.model.Client;
import com.github.myfreeit.restfultutorialapp.repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    @Transactional
    public void create(Client client) {
        clientRepository.save(client);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Client> readAll() {
        return clientRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Client read(int id) {
        return clientRepository.getReferenceById(id);
    }

    @Override
    @Transactional
    public boolean update(Client client, int id) {
        if (clientRepository.existsById(id)) {
            client.setId(id);
            clientRepository.save(client);
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
