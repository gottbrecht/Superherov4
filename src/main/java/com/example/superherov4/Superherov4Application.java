package com.example.superherov4;

import com.example.superherov4.repository.SuperheroRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class Superherov4Application {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(Superherov4Application.class, args);

    }
}
