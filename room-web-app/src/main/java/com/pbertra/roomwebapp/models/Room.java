package com.pbertra.roomwebapp.models;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="ROOM")
public class Room {
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "ROOM_NUMBER")
    private String number;
    @Column(name = "NAME")
    private String name;
    @Column(name = "BED_INFO")
    private String info;

}
