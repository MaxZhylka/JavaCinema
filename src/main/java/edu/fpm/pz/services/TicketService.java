package edu.fpm.pz.services;

import edu.fpm.pz.dtos.CreateUpdateTicketDto;
import edu.fpm.pz.dtos.TicketDto;
import edu.fpm.pz.entities.Ticket;
import edu.fpm.pz.repositories.TicketRepository;
import edu.fpm.pz.services.interfaces.ITicketService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketService implements ITicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public TicketDto buyTicket(CreateUpdateTicketDto dto) {
        Ticket ticket = new Ticket(dto.getScreeningId(), dto.getCustomerName(), dto.getSeatNumber());
        Ticket saved = ticketRepository.save(ticket);
        return mapToDto(saved);
    }

    @Override
    public List<TicketDto> getTicketsByCustomerName(String customerName) {
        return ticketRepository.findByCustomerName(customerName)
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    private TicketDto mapToDto(Ticket ticket) {
        return new TicketDto(ticket.getId(), ticket.getScreeningId(), ticket.getCustomerName(), ticket.getSeatNumber());
    }
}
