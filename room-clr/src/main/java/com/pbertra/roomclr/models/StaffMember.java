package com.pbertra.roomwebapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StaffMember {
    private String employeeId;
    private String firstName;
    private String lastName;
    private Position position;
}
