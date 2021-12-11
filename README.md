# This project given as assignment

#Assumption
Created the webservice in spring boot.
No database used
#Get request
@GetMapping("/all-shifts") --> Display available shifts 
@GetMapping("/all-shifts/{id}") --> Display start time and end time for specific id (ex: 1,2,3)
@GetMapping("/number-of-shifts") --> Display number of shifts for a day

#Put request ; http://localhost:8080/set-employees-to-shift/1
@PutMapping("/set-employees-to-shift/{id}") --> Assign employess based on shit id
RequestBody [1,2,3] 
[1,2,3] --> employee id in array

http://localhost:8080/set-employees-to-shift
Request Body:
[{
 "id":1,
  "employees":[1,7,8,9]
},
{
 "id":2,
  "employees":[1,2,3]
},
{
 "id":3,
  "employees":[4,5,6]
}]


