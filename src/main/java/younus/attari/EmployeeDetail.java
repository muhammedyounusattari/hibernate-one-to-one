package younus.attari;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empDetail")
public class EmployeeDetail {

	@Id
	@GeneratedValue
	@Column(name="employeeId")
	private Long empId;

	private String empAddress, empDOJ, empLastDate, empFirstName, empLastName, empManager;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpDOJ() {
		return empDOJ;
	}

	public void setEmpDOJ(String empDOJ) {
		this.empDOJ = empDOJ;
	}

	public String getEmpLastDate() {
		return empLastDate;
	}

	public void setEmpLastDate(String empLastDate) {
		this.empLastDate = empLastDate;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpManager() {
		return empManager;
	}

	public void setEmpManager(String empManager) {
		this.empManager = empManager;
	}

}
