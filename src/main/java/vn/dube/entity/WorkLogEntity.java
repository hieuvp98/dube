package vn.dube.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "work_log", schema = "dube", catalog = "")
public class WorkLogEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimesheetId() {
        return timesheetId;
    }

    public void setTimesheetId(String timesheetId) {
        this.timesheetId = timesheetId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getDayInMonth() {
        return dayInMonth;
    }

    public void setDayInMonth(Integer dayInMonth) {
        this.dayInMonth = dayInMonth;
    }

    public Integer getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Integer workingHours) {
        this.workingHours = workingHours;
    }

    public Integer getOtHours() {
        return otHours;
    }

    public void setOtHours(Integer otHours) {
        this.otHours = otHours;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkLogEntity that = (WorkLogEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(timesheetId, that.timesheetId) && Objects.equals(employeeId, that.employeeId) && Objects.equals(dayInMonth, that.dayInMonth) && Objects.equals(workingHours, that.workingHours) && Objects.equals(otHours, that.otHours) && Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, timesheetId, employeeId, dayInMonth, workingHours, otHours, note);
    }
}
