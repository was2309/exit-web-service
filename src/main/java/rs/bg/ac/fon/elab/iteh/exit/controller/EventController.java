package rs.bg.ac.fon.elab.iteh.exit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.bg.ac.fon.elab.iteh.exit.dto.CreateEventDto;
import rs.bg.ac.fon.elab.iteh.exit.mapper.EventMapper;
import rs.bg.ac.fon.elab.iteh.exit.model.Event;
import rs.bg.ac.fon.elab.iteh.exit.model.Performer;
import rs.bg.ac.fon.elab.iteh.exit.model.Stage;
import rs.bg.ac.fon.elab.iteh.exit.model.User;


import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/events")
@CrossOrigin(origins = "*",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class EventController {


    @GetMapping("{id}")
    public ResponseEntity<?> getEventById(@PathVariable Long id) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<Event>> getAllEvents() {
        return null;
    }

    @PostMapping
    public ResponseEntity<?> addNewEvent(@RequestBody CreateEventDto dto) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateEvent(@PathVariable Long id,
                                         @RequestBody CreateEventDto dto) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEvent(@PathVariable Long id) {
        return null;
    }
}

