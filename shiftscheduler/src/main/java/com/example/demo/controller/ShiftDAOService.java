package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ShiftDAOService {
	private static int shiftCount = 3;
	private static List<Shift> shifts = new ArrayList<>();
	List<Shift> list = new ArrayList<>();
	List<Integer> empid = new ArrayList<>();
	Boolean dups = false;

	static {
		Shift shift1 = new Shift(1, "early-morning", 0, 8);
		shifts.add(shift1);

		Shift shift2 = new Shift(2, "afternoon", 8, 16);
		shifts.add(shift2);

		Shift shift3 = new Shift(3, "evening", 16, 24);
		shifts.add(shift3);
	}

	public List<Shift> getAllShifts() {
		return shifts;
	}

	public Shift findShift(int id) {
		for (Shift shift : shifts) {
			if (shift.getShiftId() == id) {
				return shift;
			}
		}
		return null;
	}

	public Shift setEmployeeToShift(int id, ArrayList<Integer> employees, StringBuffer Message) {
		for (Shift shift : shifts) {
			if (shift.getShiftId() == id) {
				shift.setEmployees(employees);
				if (Message != null) {
					if (Message.length() == 0)
					{
						shift.setMessage("Successful");
					}else {
						shift.setMessage(" ");
					}
					shift.setError(Message);
				} else {
					shift.setError(Message);
					shift.setMessage("Successful");

				}
				for (int i = 0; i < employees.size(); i++) {
					if (employees.lastIndexOf(employees.get(i)) != i) {
						shift.setMessage("Employee assigned more than once in same shift");
					}
				}

				return shift;

			}

		}
		return null;
	}

	public int getNumberOfShifts() {
		return shiftCount;
	}

	public List<Shift> setEmployeeToShift(List<ShiftForDay> shiftforday) {
		List<Shift> list = new ArrayList<>();
		List<Integer> empid = new ArrayList<>();
		Boolean dups = false;
		StringBuffer Msg = new StringBuffer("Employee id's with more than one shift -->  ");
		for (ShiftForDay shiftemp : shiftforday) {
			empid.addAll(shiftemp.getEmployees());
		}
		for (int i = 0; i < empid.size(); i++) {
			if (empid.lastIndexOf(empid.get(i)) != i) {
				Msg.append(empid.get(i));
				Msg.append(" ");
				dups = true;

			}
		}

		if (dups == false) {
			Msg.delete(0, Msg.length());

		}

		for (ShiftForDay shiftfor : shiftforday) {
			list.add(setEmployeeToShift(shiftfor.getId(), shiftfor.getEmployees(), Msg));
		}
		return list;
	}

}
