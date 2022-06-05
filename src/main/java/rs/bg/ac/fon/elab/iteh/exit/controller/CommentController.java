package rs.bg.ac.fon.elab.iteh.exit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.bg.ac.fon.elab.iteh.exit.dto.CommentSaveDto;
import rs.bg.ac.fon.elab.iteh.exit.model.Comment;
import rs.bg.ac.fon.elab.iteh.exit.model.Event;
import rs.bg.ac.fon.elab.iteh.exit.model.User;


import java.util.List;

@RestController
@RequestMapping("/api/comments")
@CrossOrigin(origins = "*",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class CommentController {


    @GetMapping("/event/{event}")
    public ResponseEntity<?> getAllCommentsForEvent(@PathVariable("event") Long eventId){
        return null;
    }

    @GetMapping
    public List<Comment> getAllComments(){
        return null;
    }

    @PostMapping
    public ResponseEntity<?> saveNewComment(@RequestBody CommentSaveDto dto){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCommentById(@PathVariable Long id){
       return null;
    }
}
