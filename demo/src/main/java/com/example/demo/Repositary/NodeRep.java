package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Node;


@Repository
public interface NodeRep extends JpaRepository<Node,String>{

}
