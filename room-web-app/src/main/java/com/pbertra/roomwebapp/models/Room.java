package com.pbertra.roomwebapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Room {
    private long id;
    private String number;
    private String name;
    private String info;

}
