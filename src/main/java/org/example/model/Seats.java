package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "seats")
@Entity
@Data
@NoArgsConstructor
public class Seats {
    @Id
    @Column(name = "seat_to")
    private String seat_to;

    @Column(name = "aircraft_code")
    private String aircraft_code;


    @Column(name = "fare_conditions")
    private String fare_conditions;
}
