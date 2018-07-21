package com.szczudlinski.dawid.offer.offer.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OfferRepository extends JpaRepository<Offer, Long> {
    Optional<Offer> getByOfferNumber(String number);
}
