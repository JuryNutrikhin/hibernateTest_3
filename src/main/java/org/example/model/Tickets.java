package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table
@Entity
@Data
@NoArgsConstructor

public class Tickets {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "ticket_no")
    // @JoinColumn (name ="ticket_no" , referencedColumnName = "ticket_no")
    private String ticket_no;

//    @Column( name = "book_ref")
//    private String book_ref;
    @ManyToOne
    @JoinColumn(name ="book_ref",referencedColumnName = "book_ref")
    private Bookings bookings;

    @Column (name = "passenger_id")
    private String passenger_id;

    @Column (name = "passenger_name")
    private String passenger_name;

    @Column (name = "contact_data")
    private String contact_data;

    public Tickets(Bookings bookings, String passenger_id, String passenger_name, String contact_data) {
        this.bookings = bookings;
        this.passenger_id = passenger_id;
        this.passenger_name = passenger_name;
        this.contact_data = contact_data;
    }
}
