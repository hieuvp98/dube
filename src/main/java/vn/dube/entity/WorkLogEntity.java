package vn.dube.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "work_log")
@Getter
@Setter
public class WorkLogEntity {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "timesheet_id")
    private String timesheetId;
    @Basic
    @Column(name = "employee_id")
    private Integer employeeId;
    @Basic
    @Column(name = "day_in_month")
    private Integer dayInMonth;
    @Basic
    @Column(name = "working_hours")
    private Integer workingHours;
    @Basic
    @Column(name = "ot_hours")
    private Integer otHours;
    @Basic
    @Column(name = "note")
    private String note;
}
