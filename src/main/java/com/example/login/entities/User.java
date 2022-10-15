package com.example.login.entities;

public class User {
	
	public int id;
    public String name;
    
    //setting up constructor
   public User(int id,String name) {
	super();
	this.id=id;
	this.name=name;
}

//default constructor

public User() {
	super();
}

public void setName(String name) {
	this.name=name;
}

public String getName() {
	return name;
}

public void setId(int id) {
	this.id=id;
}

public int getId() {
	return id;
}


@Override
public String toString() {
	return name;
}

}
    

