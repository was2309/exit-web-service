package rs.bg.ac.fon.elab.iteh.exit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.bg.ac.fon.elab.iteh.exit.model.Stage;


import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/api/stages")
@CrossOrigin(origins = "*",
        methods = {GET, POST, PUT, DELETE, OPTIONS})
public class StageController {


    @GetMapping("/{id}")
    public ResponseEntity<?> getStageById(@PathVariable Long id) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<Stage>> getAllStages() {
        return null;
    }

    @PostMapping()
    public Stage addNewStage(@RequestBody Stage newStage) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateStage(@PathVariable Long id,
                                         @RequestBody Stage newStage) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStage(@PathVariable Long id) {
        return null;
    }
}