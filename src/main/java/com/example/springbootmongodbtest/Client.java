package com.example.springbootmongodbtest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "client")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    private String id;
    //@Indexed(unique = true)
    private  String name;
    private String password;
    private  String industrySector;
    // @Indexed(direction = IndexDirection.ASCENDING)
    private int code;
    private Adress adress;
    private Type type;
}
