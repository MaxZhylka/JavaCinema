package edu.fpm.pz.services.interfaces;

import edu.fpm.pz.dtos.CreateUpdateTicketDto;
import edu.fpm.pz.dtos.TicketDto;

import java.util.List;

public interface ITicketService {
    TicketDto buyTicket(CreateUpdateTicketDto dto);
    List<TicketDto> getTicketsByCustomerName(String customerName);
}
