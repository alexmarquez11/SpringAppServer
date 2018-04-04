/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.appfinal.repositories;

import com.example.appfinal.models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

/**
 *
 */
public interface TodoRepository extends MongoRepository<Todo, String> {
    
    
}
