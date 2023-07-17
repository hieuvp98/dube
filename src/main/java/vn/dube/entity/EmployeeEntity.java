package vn.dube.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class EmployeeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "role")
    private String role;
    @Basic
    @Column(name = "salary")
    private Integer salary;
    @Basic
    @Column(name = "birthday")
    private Date birthday;
    @Basic
    @Column(name = "national_id")
    private String nationalId;
    @Basic
    @Column(name = "phone_number")
    private String phoneNumber;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "bhxh")
    private String bhxh;
    @Basic
    @Column(name = "mst")
    private String mst;
    @Basic
    @Column(name = "onboard_date")
    private Date onboardDate;
    @Basic
    @Column(name = "quit_date")
    private Date quitDate;
    @Basic
    @Column(name = "probation_rate")
    private Integer probationRate;
    @Basic
    @Column(name = "bank")
    private String bank;
    @Basic
    @Column(name = "account_number")
    private String accountNumber;
    @Basic
    @Column(name = "hr")
    private String hr;
    @Basic
    @Column(name = "note")
    private String note;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "project_id")
    private Integer projectId;
}
