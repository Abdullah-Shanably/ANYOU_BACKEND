package com.mart.anyouwebappbackend.cards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardsService {
    @Autowired
    private final CardsRepository cardsRepository;

    @Autowired
    public CardsService(CardsRepository cardsRepository) {
        this.cardsRepository = cardsRepository;
    }

    public Iterable<Cards> getAllCards() {
        return cardsRepository.findAll();
    }

    public Optional<Cards> getCardsById(long id) {
        return cardsRepository.findById(id);
    }

    public Cards saveCards(Cards cards) {
        return cardsRepository.save(cards);
    }

    public void deleteCards(long id) {
        cardsRepository.deleteById(id);
    }}
