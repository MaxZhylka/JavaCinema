package edu.fpm.pz.dtos;

public class CreateUpdateTicketDto {
    private Long screeningId;
    private String customerName;
    private String seatNumber;

    public CreateUpdateTicketDto(Long screeningId, String customerName, String seatNumber) {
        this.screeningId = screeningId;
        this.customerName = customerName;
        this.seatNumber = seatNumber;
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
