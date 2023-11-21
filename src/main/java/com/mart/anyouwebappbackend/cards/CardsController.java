package com.mart.anyouwebappbackend.cards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/anyou/cards")
public class CardsController {

    private final CardsService cardsService;

    @Autowired
    public CardsController(CardsService cardsService) {
        this.cardsService = cardsService;
    }

    @GetMapping
    public Iterable<Cards> getAllCards() {
        return cardsService.getAllCards();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cards> getCardsById(@PathVariable long id) {
        Optional<Cards> Cards = cardsService.getCardsById(id);
        return Cards.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Cards> saveCards(@RequestBody Cards Cards) {
        Cards savedCards = cardsService.saveCards(Cards);
        return new ResponseEntity<>(savedCards, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cards> updateCards(@PathVariable long id, @RequestBody Cards Cards) {
        Optional<Cards> existingCards = cardsService.getCardsById(id);
        if (existingCards.isPresent()) {
            Cards.setId(id);
            Cards updatedCards = cardsService.saveCards(Cards);
            return new ResponseEntity<>(updatedCards, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCards(@PathVariable long id) {
        Optional<Cards> existingCards = cardsService.getCardsById(id);
        if (existingCards.isPresent()) {
            cardsService.deleteCards(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
