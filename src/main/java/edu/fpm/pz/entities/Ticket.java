package edu.fpm.pz.entities;

import jakarta.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "screening_id", nullable = false)
    private Long screeningId;

    private String customerName;
    private String seatNumber;

    public Ticket() {}

    public Ticket(Long screeningId, String customerName, String seatNumber) {
        this.screeningId = screeningId;
        this.customerName = customerName;
        this.seatNumber = seatNumber;
    }

    public Long getId() {
        return id;
    }

    public Long getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(Long screeningId) {
        this.screeningId = screeningId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
}
