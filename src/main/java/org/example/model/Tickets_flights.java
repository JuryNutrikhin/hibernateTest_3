package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table
@Entity
@Data
@NoArgsConstructor

public class Tickets_flights {

    @ManyToOne
    @JoinColumn(name = "ticket_no", referencedColumnName = "ticket_no")
    private Seats seats;

    @Column(name = "amount")
    private double amount;
    @Id
    @Column(name = "ticket_no")
    private int ticket_no;
    @Id
    @Column(name = "flight_id")
    private int flight_id;
}
