package com.am;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Employee {
@Id
private int empId;
@Override
public String toString() {
	return "Employee  empId is  =" + empId + " \nempName=" + empName + "\n empSal=" + empSal + "\n address=" + address
			+ "\n email=" + email + " \n designation=" + designation + "\n age=" + age + "\n gender=" + gender
			+ "\n workingdays=" + workingdays + "\n accountno=" + accountno + "\n mobno=" + mobno + " \n\n";
	 
	  
}
private String empName;
private double empSal;
private String address;
private String email;
private String designation;
private  int age;
private String gender;
private int workingdays;
private String accountno;
private String pan;
private String uan;
private double pf;
private double da;
private double tax;

public double getTax() {
	return tax;
}
public void setTax(double tax) {
	this.tax = tax;
}
public double getDa() {
	return da;
}
public void setDa(double da) {
	this.da = da;
}
public double getHra() {
	return hra;
}
public void setHra(double hra) {
	this.hra = hra;
}
public double getGs() {
	return gs;
}
public void setGs(double gs) {
	this.gs = gs;
}
public double getNs() {
	return ns;
}
public void setNs(double ns) {
	this.ns = ns;
}
private double hra;
private double gs;
private double ns;
public double getPf() {
	return pf;
}
public void setPf(double pf) {
	this.pf = pf;
}
public String getUan() {
	return uan;
}
public void setUan(String uan) {
	this.uan = uan;
}
public String getPan() {
	return pan;
}
public void setPan(String pan) {
	this.pan = pan;
}
private String mobno;

public String getMobno() {
	return mobno;
}
public void setMobno(String mobno) {
	this.mobno = mobno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getWorkingdays() {
	return workingdays;
}
public void setWorkingdays(int workingdays) {
	this.workingdays = workingdays;
}
public String getAccountno() {
	return accountno;
}
public void setAccountno(String accountno) {
	this.accountno = accountno;
}

public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getEmpSal() {
	return empSal;
}
public void setEmpSal(double empSal) {
	this.empSal = empSal;
}

}
