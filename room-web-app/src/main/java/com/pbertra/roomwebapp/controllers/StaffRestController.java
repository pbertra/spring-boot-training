package com.pbertra.roomwebapp.controllers;

import com.pbertra.roomwebapp.models.StaffMember;
import com.pbertra.roomwebapp.services.StaffService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
@RequiredArgsConstructor
public class StaffRestController {
    @NonNull
    private StaffService staffService;

    @GetMapping
    public List<StaffMember> getAllStaff() {
        return staffService.getAllStaff();
    }
}
