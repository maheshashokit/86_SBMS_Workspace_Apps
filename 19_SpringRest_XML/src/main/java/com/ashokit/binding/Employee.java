package com.ashokit.binding;

import com.ashokit.CustomDateDeserializer;
import com.ashokit.CustomDateSerialzer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;
import java.util.List;

@JsonInclude(value= JsonInclude.Include.NON_NULL)
public class Employee {

    //@JsonProperty(value = "employeeId")
    private int id;

   // @JsonProperty(value = "employeeName")
    private String name;

    private String designation;

    private boolean workFromHome;

    private List<Address> address;

    private JobDetails jobDetails;

    @JsonSerialize(using = CustomDateSerialzer.class)
    @JsonDeserialize(using= CustomDateDeserializer.class)
    private Date dob;

    public Employee(){
        System.out.println("Employee Class");
    }

    public Employee(int id, String name, String designation, boolean workFromHome) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.workFromHome = workFromHome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public boolean isWorkFromHome() {
        return workFromHome;
    }

    public void setWorkFromHome(boolean workFromHome) {
        this.workFromHome = workFromHome;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public JobDetails getJobDetails() {
        return jobDetails;
    }

    public void setJobDetails(JobDetails jobDetails) {
        this.jobDetails = jobDetails;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", workFromHome=" + workFromHome +
                ", address=" + address +
                ", jobDetails=" + jobDetails +
                ", dob=" + dob +
                '}';
    }
}
