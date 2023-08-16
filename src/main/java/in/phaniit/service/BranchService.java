package in.phaniit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.phaniit.Entity.Branch;
import in.phaniit.repository.BranchRepository;

@Service
public class BranchService {
    
	@Autowired
    private BranchRepository branchRepository;

    public Branch createBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    public Branch getBranchById(Long id) {
        return branchRepository.findById(id).orElse(null);
    }
}
