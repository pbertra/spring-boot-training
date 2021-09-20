package com.pbertra.roomwebapp.services;

import com.pbertra.roomwebapp.models.Position;
import com.pbertra.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {
    private static List<StaffMember> staff = new ArrayList<>();

    static {
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Patrice", "Bertrand", Position.FRONT_DESK));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Camille", "Bertrand", Position.HOUSEKEEPING));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Maeva", "Bertrand", Position.CONCIERGE));
    }

    public List<StaffMember> getAllStaff() {
        return staff;
    }
}
