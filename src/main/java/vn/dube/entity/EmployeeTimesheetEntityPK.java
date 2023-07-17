package vn.dube.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeTimesheetEntityPK implements Serializable {
    @Column(name = "employee_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    @Column(name = "timesheet_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String timesheetId;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getTimesheetId() {
        return timesheetId;
    }

    public void setTimesheetId(String timesheetId) {
        this.timesheetId = timesheetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTimesheetEntityPK that = (EmployeeTimesheetEntityPK) o;
        return Objects.equals(employeeId, that.employeeId) && Objects.equals(timesheetId, that.timesheetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, timesheetId);
    }
}
