package rs.bg.ac.fon.elab.iteh.exit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.bg.ac.fon.elab.iteh.exit.dto.TicketSaveDto;
import rs.bg.ac.fon.elab.iteh.exit.model.Ticket;


import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin(origins = "*",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class TicketController {


    @GetMapping("{id}")
    public Ticket getTicketById(@PathVariable Long id) {
        return null;
    }

    @GetMapping
    public List<Ticket> getAllTicket() {
        return null;
    }

    @GetMapping("/user/{user}")
    public List<Ticket> getAllTicketsOfUser(@PathVariable("user") Long userId) {
        return null;
    }

    @PostMapping
    public ResponseEntity<?> saveTickets(@RequestBody TicketSaveDto[] dto) {
        return null;
    }

    @PutMapping("/{id}")
    public Ticket updateTicket(@PathVariable Long id,
                               @RequestBody Ticket newTicket) {
        return null;
    }

    @DeleteMapping("/{id}")
    public Ticket deleteTicket(@PathVariable Long id) {
        return null;
    }
}
