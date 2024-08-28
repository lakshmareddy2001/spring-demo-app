package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositary.NodeRep;
import com.example.demo.model.Node;


@Service
public class NodeDAO {
	
	@Autowired
	NodeRep nodes;
	
//	List<Node> dataBase = new ArrayList<>(Arrays.asList( new Node("T300_001","Node1","Sample Text","Sample Text","Transponder","Product Node Group Name","Sample Text","Sample Text"),
//										 new Node("T300_001","Node2","Sample Text","Sample Text","Transponder","Product Node Group Name","Sample Text","Sample Text")));
	
	public List<Node> getNodes(){
		return nodes.findAll();
	}
	
	public Node getNodeById(String id) {
		return nodes.findById(id).orElse(null);
	}
	
	public Node putNode(Node node) {
		return nodes.save(node);
	}
}
