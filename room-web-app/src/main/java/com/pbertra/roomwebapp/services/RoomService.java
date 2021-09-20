package com.pbertra.roomwebapp.services;

import com.pbertra.roomwebapp.data.RoomRepository;
import com.pbertra.roomwebapp.models.Room;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {

    @NonNull
    private final RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
}
