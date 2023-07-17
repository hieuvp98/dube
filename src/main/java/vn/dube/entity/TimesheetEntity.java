package vn.dube.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "timesheet")
@Getter
@Setter
public class TimesheetEntity {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "month")
    private Date month;
    @Basic
    @Column(name = "total_working_day")
    private Integer totalWorkingDay;
    @Basic
    @Column(name = "weekend_date")
    private String weekendDate;
    @Basic
    @Column(name = "holiday_date")
    private String holidayDate;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "created_by")
    private String createdBy;
    @Basic
    @Column(name = "updated_by")
    private String updatedBy;
    @Basic
    @Column(name = "updated_time")
    private Timestamp updatedTime;
}
