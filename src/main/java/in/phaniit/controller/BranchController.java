package in.phaniit.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.phaniit.Entity.Branch;
import in.phaniit.service.BranchService;


@RestController
public class BranchController {
	
	@Autowired
	private BranchService branchService;

	@PostMapping(
			value = "/branch",
			consumes = {"application/xml", "application/json"},
			produces= {"application/xml", "application/json"}			
			)
	public ResponseEntity<Branch> createBranch(@RequestBody Branch branch) {
		Branch createdBranch = branchService.createBranch(branch);
		return ResponseEntity.ok(createdBranch);
	}

	@GetMapping(		
			value="/branch/{id}",
			produces = {"application/xml", "application/json"}
			)
	public ResponseEntity<Branch> getBranch(@PathVariable Long id) {
		Branch branch = branchService.getBranchById(id);
		if (branch != null) {
			return ResponseEntity.ok(branch);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
