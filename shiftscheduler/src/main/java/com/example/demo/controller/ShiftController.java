package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShiftController {

	@Autowired
	ShiftDAOService service;

	@GetMapping("/all-shifts")
	public List<Shift> retrieveAllShifts() {
		return service.getAllShifts();
	}

	@GetMapping("/all-shifts/{id}")
	public Shift retrieveShift(@PathVariable int id) {
		return service.findShift(id);
	}

	@GetMapping("/number-of-shifts")
	public int shiftsCount() {
		return service.getNumberOfShifts();
	}

	@PutMapping("/set-employees-to-shift/{id}")
	public Shift setEmployeesToShift(@PathVariable int id, @RequestBody ArrayList<Integer> employees) {
		return service.setEmployeeToShift(id, employees, null);
	}

	@PutMapping("/set-employees-to-shift")
	public List<Shift> setEmployeesToShifts(@RequestBody List<ShiftForDay> shiftforday) {
		return (List<Shift>) service.setEmployeeToShift(shiftforday);
	}

}
