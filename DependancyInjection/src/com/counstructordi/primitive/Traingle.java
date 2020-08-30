package com.counstructordi.primitive;

public class Traingle {
private String Type;


public Traingle(String type) {
	super();
	Type = type;
}

public String getType() {
	return Type;
}

/*public void setType(String type) {
	Type = type;
}*/
public void show() {
	System.out.println(getType()+" Traingle Drawn");
}
}
