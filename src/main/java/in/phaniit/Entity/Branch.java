package in.phaniit.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "branch")
public class Branch {

	//if you are not providing @Table and @Column, JPA will smart enough to create 
	//	respective values by its names
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="City", nullable=false)
	private String city;

	@Column(name="Area", nullable=false)
	private String area;

	@Column(name="Pincode", nullable=false)
	private String pincode;


}