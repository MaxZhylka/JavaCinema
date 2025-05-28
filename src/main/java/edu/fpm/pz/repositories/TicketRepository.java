package edu.fpm.pz.repositories;
import edu.fpm.pz.entities.Ticket;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByCustomerName(String customerName);
}
