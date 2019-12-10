package com.capgemini.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springrest.beans.EmployeeInfoBean;
import com.capgemini.springrest.beans.EmployeeResponse;
import com.capgemini.springrest.service.EmployeeService;

//@Controller
@RestController // when we create controllers specific for only actual responce
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;

	// @ResponseBody
	@GetMapping(path = "/getEmployee",
			  produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse getEmployees(int empId) {
	//	return service.getEmployee(empId);
		EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();
		
		if (employeeInfoBean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Record Found...");
			response.setEmployeeInfoBean(employeeInfoBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee Id "+empId + "Not Found!!");
		}
		return response;

	}// End of getEmployees()

	// @ResponseBody
	@PutMapping(path = "/addEmployee", consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		// return service.addEmployee(employeeInfoBean);
		boolean isAdded = service.addEmployee(employeeInfoBean);

		EmployeeResponse response = new EmployeeResponse();
		if (isAdded) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Added successfully...");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Add EMployee");
		}
		return response;
	}// End of addEmployee()

	@DeleteMapping(path = "/deleteEmployee", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse deleteEmployee(int empId) {
		// return service.deleteEmployee(empId);
		boolean isAdded = service.deleteEmployee(empId);

		EmployeeResponse response = new EmployeeResponse();
		if (isAdded) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee deleted successfully...");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Delete EMployee");
		}
		return response;
	}// End of deleteEmployee()

	@PostMapping(path = "/updateEmployee", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		// return service.updateEmployee(employeeInfoBean);
		boolean isAdded = service.updateEmployee(employeeInfoBean);

		EmployeeResponse response = new EmployeeResponse();
		if (isAdded) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee updated successfully...");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Update Employee");
		}
		return response;
	}// End of updateEmployee()

	@GetMapping(path = "/getAll",
			 produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse getAllEmployee() {
		//return service.getAllEmployees();
		List<EmployeeInfoBean> employeeList = service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();
		
		if (employeeList != null && !employeeList.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Record Found...");
			response.setEmployeeList(employeeList);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to fetch Employee Record");
		}
		return response;
	}// End of getAllEmployee()
}// End of controller
