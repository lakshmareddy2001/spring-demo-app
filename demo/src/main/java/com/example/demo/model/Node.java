package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


@Entity
public class Node {
	
	@Id
	@NotNull(message="NodeId cannot be Null")
	@Pattern(regexp = "^(?!.*[!@#$%^&*()]).*$",message= "Invalid NodeId cross Check it should not contain !@#$%^&*()")
	private String nodeId;
	
	@NotNull(message="NodeName cannot be Null")
	@Pattern(regexp = "^(?!.*[!@#$%^&*()]).*$",message= "Invalid Node name cross Check it should not contain !@#$%^&*()")
	private String nodeName;
	
	@NotNull(message="Node description cannot be Null")
	@Pattern(regexp = "^(?!.*[!@#$%^&*()]).*$",message= "Invalid Node description cross Check it should not contain !@#$%^&*()")
	private String description;
	
	@NotNull(message="Node menu cannot be Null")
	@Pattern(regexp = "^(?!.*[!@#$%^&*()]).*$",message= "Invalid Node menu cross Check it should not contain !@#$%^&*()")
	private String menu;
	
	@NotNull(message="Node type cannot be Null")
	@Pattern(regexp = "^(?!.*[!@#$%^&*()]).*$",message= "Invalid Node Type cross Check it should not contain !@#$%^&*()")
	private String nodeType;
	
	@NotNull(message="Parent node Group Name cannot be Null")
	@Pattern(regexp = "^(?!.*[!@#$%^&*()]).*$",message= "Invalid Parent Node group Name cross Check it should not contain !@#$%^&*()")
	private String parentNodeGroupName;
	
	@NotNull(message="Parent node Group Id cannot be Null")
	@Pattern(regexp = "^(?!.*[!@#$%^&*()]).*$",message= "Invalid Parent node group Id cross Check it should not contain !@#$%^&*()")
	private String parentNodeGroupId;
	
	@NotNull(message="Parent Node cannot be Null")
	@Pattern(regexp = "^(?!.*[!@#$%^&*()]).*$",message= "Invalid Parent Node cross Check it should not contain !@#$%^&*()")
	private String parentNode;

	

	public Node() {
		super();
	}
	public Node(String nodeId, String nodeName, String description, String menu, String nodeType,
			String parentNodeGroupName, String parentNodeGroupId, String parentNode) {
		super();
		this.nodeId = nodeId;
		this.nodeName = nodeName;
		this.description = description;
		this.menu = menu;
		this.nodeType = nodeType;
		this.parentNodeGroupName = parentNodeGroupName;
		this.parentNodeGroupId = parentNodeGroupId;
		this.parentNode = parentNode;
	}
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getNodeType() {
		return nodeType;
	}
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}
	public String getParentNodeGroupName() {
		return parentNodeGroupName;
	}
	public void setParentNodeGroupName(String parentNodeGroupName) {
		this.parentNodeGroupName = parentNodeGroupName;
	}
	public String getParentNodeGroupId() {
		return parentNodeGroupId;
	}
	public void setParentNodeGroupId(String parentNodeGroupId) {
		this.parentNodeGroupId = parentNodeGroupId;
	}
	public String getParentNode() {
		return parentNode;
	}
	public void setParentNode(String parentNode) {
		this.parentNode = parentNode;
	}
	

}
