package com.pbertra.roomwebapp.controllers;

import com.pbertra.roomwebapp.models.Room;
import com.pbertra.roomwebapp.services.RoomService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
@RequiredArgsConstructor
public class RoomController {

    @NonNull
    private RoomService roomService;

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", roomService.getAllRooms()); // rooms is the name of the template here
        return "rooms";
    }
}
