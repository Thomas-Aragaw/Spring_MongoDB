package com.example.springbootmongodbtest;

//import com.example.springbootmongodbtest.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000" )
@RestController
public class clientController
{
    @Autowired
    private ClientRepository clientRepository;
    @GetMapping("/")
    public String welcome(){
        return("Welcome");
    }
    @PostMapping("/create")
    public void create(@RequestBody Client client) {
        clientRepository.save(client);
    }
    @GetMapping("/{id}")
    Client geClient(@PathVariable String id){
        return clientRepository.findById(id).orElse(null);
    }
    @PutMapping("/put")
    Client update (@RequestBody Client client){
        return clientRepository.save(client);
    }
     @DeleteMapping("/{id}")
    String deleteClient (@PathVariable String id){
        clientRepository.deleteById(id);
        return id;
    }
    @GetMapping("/getAll")
    public List<Client> getAll(){
        return clientRepository.findAll();
    }
    @DeleteMapping("/deleteall")
    public void deleteAll()
    {
        clientRepository.deleteAll();
    }

}
