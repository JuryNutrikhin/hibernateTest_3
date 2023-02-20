package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "bookings")
@Entity
@Data
@NoArgsConstructor
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_ref")
    private String book_ref;

    @Column(name = "book_date")
    private String book_date;
    @Column ( name = "total_amount")
    private int total_amount;

    @OneToMany(mappedBy ="bookings")
    List<Tickets> tickets ;

    public Bookings(String book_date, int total_amount) {
        this.book_date = book_date;
        this.total_amount = total_amount;
    }
}
