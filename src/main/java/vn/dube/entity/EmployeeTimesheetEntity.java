package vn.dube.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "employee_timesheet")
@IdClass(EmployeeTimesheetEntityPK.class)
@Getter
@Setter
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
}
