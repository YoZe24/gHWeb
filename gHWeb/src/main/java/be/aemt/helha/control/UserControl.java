package be.aemt.helha.control;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named
public class UserControl implements Serializable {
	private String name = "Anonymous";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String doList() {
		return "list.xhtml";
	}
	
}
