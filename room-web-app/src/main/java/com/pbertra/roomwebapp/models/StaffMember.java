package com.pbertra.roomwebapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "EMPLOYEE")
@AllArgsConstructor
@Getter
public class StaffMember {
    @Id
    @Column(name = "EMPLOYEE_ID")
    private String employeeId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Position position;

    public StaffMember() {
        employeeId = UUID.randomUUID().toString();
    }
}
