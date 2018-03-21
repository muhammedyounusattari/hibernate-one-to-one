package younus.attari;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="employee")
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue
	private Long empId;
	private String empProject, empReporting, empDesig;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="empDetailId")
	private EmployeeDetail empDetail;
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpProject() {
		return empProject;
	}
	public void setEmpProject(String empProject) {
		this.empProject = empProject;
	}
	public String getEmpReporting() {
		return empReporting;
	}
	public void setEmpReporting(String empReporting) {
		this.empReporting = empReporting;
	}
	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}
	
	public void setEmpDetail(EmployeeDetail empDetail){
		this.empDetail = empDetail;
	}
	
	public EmployeeDetail getEmpDetail(){
		return empDetail;
	}
}
