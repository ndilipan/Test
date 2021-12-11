package com.example.demo.controller;

import java.util.ArrayList;

public class ShiftForDay {
	private int id;
	private ArrayList<Integer> employees;

	
	public ShiftForDay(int id, ArrayList<Integer> employees) {
		super();
		this.id = id;
		this.employees = employees;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public ArrayList<Integer> getEmployees() {
		return employees;
	}


	public void setEmployees(ArrayList<Integer> employees) {
		this.employees = employees;
	}
	
	
}

