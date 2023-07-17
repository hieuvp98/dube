package vn.dube.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "timesheet", schema = "dube", catalog = "")
public class TimesheetEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public Integer getTotalWorkingDay() {
        return totalWorkingDay;
    }

    public void setTotalWorkingDay(Integer totalWorkingDay) {
        this.totalWorkingDay = totalWorkingDay;
    }

    public String getWeekendDate() {
        return weekendDate;
    }

    public void setWeekendDate(String weekendDate) {
        this.weekendDate = weekendDate;
    }

    public String getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(String holidayDate) {
        this.holidayDate = holidayDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimesheetEntity that = (TimesheetEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(month, that.month) && Objects.equals(totalWorkingDay, that.totalWorkingDay) && Objects.equals(weekendDate, that.weekendDate) && Objects.equals(holidayDate, that.holidayDate) && Objects.equals(status, that.status) && Objects.equals(createdBy, that.createdBy) && Objects.equals(updatedBy, that.updatedBy) && Objects.equals(updatedTime, that.updatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, month, totalWorkingDay, weekendDate, holidayDate, status, createdBy, updatedBy, updatedTime);
    }
}
