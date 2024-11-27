package com.example.loltistics.controller;


import com.example.loltistics.dto.MatchDTO;
import com.example.loltistics.model.Match;
import com.example.loltistics.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matches")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @PostMapping
    public ResponseEntity<Match> createMatch(@RequestBody MatchDTO matchDTO) {
        Match match = matchService.createMatch(matchDTO);
        return ResponseEntity.ok(match);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Match> getMatch(@PathVariable Long id) {
        Match match = matchService.getMatchById(id);
        return ResponseEntity.ok(match);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMatch(@PathVariable Long id) {
        matchService.deleteMatch(id);
        return ResponseEntity.noContent().build();
    }
}