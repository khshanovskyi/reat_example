package ua.khshanovskyi.rest.exampe.rest_example.service;

import ua.khshanovskyi.rest.exampe.rest_example.model.Client;

import java.util.List;

//CRUD
public interface ClientService {

    //C
    void create(Client client);

    //R
    List<Client> readAll();

    //R
    Client read(int id);

    //U
    boolean update(Client client,int id);

    //D
    boolean delete (int id);
}
