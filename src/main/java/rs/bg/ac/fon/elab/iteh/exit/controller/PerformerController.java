package rs.bg.ac.fon.elab.iteh.exit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.bg.ac.fon.elab.iteh.exit.model.Performance;
import rs.bg.ac.fon.elab.iteh.exit.model.Performer;


import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/api/performers")
@CrossOrigin(origins = "*",
        methods = {GET, POST, PUT, DELETE, OPTIONS})
public class PerformerController {



    @GetMapping("{id}")
    public ResponseEntity<?> getPerformerById(@PathVariable Long id){
       return null;
    }

    @GetMapping
    public ResponseEntity<List<Performer>> getAllPerformers(){
        return null;
    }

    @GetMapping("/event/{event}")
    public ResponseEntity<List<Performer>> getAllPerformersOfEvent(@PathVariable("event") Long eventId){
        return null;
    }

    @PostMapping
    public Performer addNewPerformer(@RequestBody Performer newPerformer){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatePerformer(@PathVariable Long id,
                                             @RequestBody Performer newPerformer){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePerformer(@PathVariable Long id){
        return null;
    }


}