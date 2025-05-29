package edu.fpm.pz.controllers;

import edu.fpm.pz.dtos.CreateUpdateTicketDto;
import edu.fpm.pz.dtos.TicketDto;

import edu.fpm.pz.services.interfaces.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private ITicketService ticketRepository;

    @PostMapping
    public TicketDto buyTicket(@RequestBody CreateUpdateTicketDto ticket) {
        return ticketRepository.buyTicket(ticket);
    }

    @GetMapping("/by-customer")
    public List<TicketDto> getTicketsByCustomer(@RequestParam String customerName) {
        return ticketRepository.getTicketsByCustomerName(customerName);
    }
}
