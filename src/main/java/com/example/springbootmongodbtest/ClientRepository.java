package com.example.springbootmongodbtest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends MongoRepository<Client,String> {
//    public Client findClientByName(String name);
//    public List<Client> findClientByCode(int code);
    //List<Client> findCodeLessThan(int code);
/*    @Query(value = "{address.city}")
    //List<Client> findByCity(String city);*/
  //  Optional<Client> findClientByName(String name);

}
