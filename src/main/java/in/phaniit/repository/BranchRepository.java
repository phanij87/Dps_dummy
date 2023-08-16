package in.phaniit.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.phaniit.Entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {
}
