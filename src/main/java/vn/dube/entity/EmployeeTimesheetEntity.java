package vn.dube.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "employee_timesheet", schema = "dube", catalog = "")
@IdClass(EmployeeTimesheetEntityPK.class)
public class EmployeeTimesheetEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "employee_id")
    private Integer employeeId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "timesheet_id")
    private String timesheetId;
    @Basic
    @Column(name = "total_working_hours")
    private Integer totalWorkingHours;
    @Basic
    @Column(name = "total_ot_hours")
    private Integer totalOtHours;
    @Basic
    @Column(name = "total_mandays")
    private Integer totalMandays;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "updated_by")
    private String updatedBy;
    @Basic
    @Column(name = "updated_time")
    private Timestamp updatedTime;
    @Basic
    @Column(name = "approved_by")
    private String approvedBy;
    @Basic
    @Column(name = "approved_time")
    private Timestamp approvedTime;

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

    public Integer getTotalWorkingHours() {
        return totalWorkingHours;
    }

    public void setTotalWorkingHours(Integer totalWorkingHours) {
        this.totalWorkingHours = totalWorkingHours;
    }

    public Integer getTotalOtHours() {
        return totalOtHours;
    }

    public void setTotalOtHours(Integer totalOtHours) {
        this.totalOtHours = totalOtHours;
    }

    public Integer getTotalMandays() {
        return totalMandays;
    }

    public void setTotalMandays(Integer totalMandays) {
        this.totalMandays = totalMandays;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Timestamp getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(Timestamp approvedTime) {
        this.approvedTime = approvedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTimesheetEntity that = (EmployeeTimesheetEntity) o;
        return Objects.equals(employeeId, that.employeeId) && Objects.equals(timesheetId, that.timesheetId) && Objects.equals(totalWorkingHours, that.totalWorkingHours) && Objects.equals(totalOtHours, that.totalOtHours) && Objects.equals(totalMandays, that.totalMandays) && Objects.equals(status, that.status) && Objects.equals(updatedBy, that.updatedBy) && Objects.equals(updatedTime, that.updatedTime) && Objects.equals(approvedBy, that.approvedBy) && Objects.equals(approvedTime, that.approvedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, timesheetId, totalWorkingHours, totalOtHours, totalMandays, status, updatedBy, updatedTime, approvedBy, approvedTime);
    }
}
