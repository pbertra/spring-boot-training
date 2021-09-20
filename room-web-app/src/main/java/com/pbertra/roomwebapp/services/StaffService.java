package com.pbertra.roomwebapp.services;

import com.pbertra.roomwebapp.data.StaffMemberRepository;
import com.pbertra.roomwebapp.models.Position;
import com.pbertra.roomwebapp.models.StaffMember;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StaffService {
    @NonNull
    private StaffMemberRepository staffMemberRepository;

    public List<StaffMember> getAllStaff() {
        return staffMemberRepository.findAll();
    }
}
