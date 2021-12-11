package com.example.demo.controller;

import java.util.ArrayList;

public class Shift {

    private int shiftId;
    private String name;
    private int startTime, endTime;
    private ArrayList<Integer> employees;
    private String message;
    private StringBuffer error;

    

	public Shift() {

    }

	public Shift(int shiftId, String name, int startTime, int endTime) {
		super();
		this.shiftId = shiftId;
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getShiftId() {
		return shiftId;
	}

	public void setShiftId(int shiftId) {
		this.shiftId = shiftId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public ArrayList<Integer> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Integer> employees) {
		this.employees = employees;
	}

	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public StringBuffer getError() {
		return error;
	}

	public void setError(StringBuffer error) {
		this.error = error;
	}
    

}