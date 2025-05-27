package lk.ac.vau.fas.ict.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Department;
import lk.ac.vau.fas.ict.repo.DepartmentRepo;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	@Autowired
	private DepartmentRepo repo;
	
	@GetMapping
	public List<Department> getDepts(){
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Department getDept(@PathVariable("id") int id) {
		if(repo.findById(id).isEmpty()) {
			return null;
		}
		return repo.findById(id).get();
	}
	
	@PostMapping
	public String addDept(@RequestBody Department department) {
		repo.save(department);
		return "New department added";
	}
	
	@DeleteMapping("/{id}")
	public String deleteDept(@PathVariable("id") int id) {
	    if (repo.findById(id).isEmpty()) {
	        return "Department not found";
	    }
	    repo.deleteById(id);
	    return "Department deleted successfully";
	}

}
