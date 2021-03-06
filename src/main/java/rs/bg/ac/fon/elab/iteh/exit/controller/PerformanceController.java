package rs.bg.ac.fon.elab.iteh.exit.controller;

import org.springframework.web.bind.annotation.*;
import rs.bg.ac.fon.elab.iteh.exit.model.Performance;

import java.util.List;

@RestController
@RequestMapping("/api/performance")
@CrossOrigin(origins = "*",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class PerformanceController {
    @GetMapping("{id}")
    public Performance getPerformanceById(@PathVariable Long id){
        return null;
    }

    @GetMapping
    public List<Performance> getAllPerformances(){
        return null;
    }

    @PostMapping
    public Performance addNewPerformance(@RequestBody Performance newPerformer){
        return null;
    }

    @PutMapping("/{id}")
    public Performance updatePerformance(@PathVariable Long id,
                                         @RequestBody Performance newPerformer){
        return null;
    }

    @DeleteMapping("/{id}")
    public Performance deletePerformance(@PathVariable Long id){
        return null;
    }
}