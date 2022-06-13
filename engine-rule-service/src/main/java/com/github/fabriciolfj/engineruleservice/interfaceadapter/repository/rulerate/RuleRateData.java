package com.github.fabriciolfj.engineruleservice.interfaceadapter.repository.rulerate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "rules_rate")
public record RuleRateData(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        @Column(name = "date_minimum", columnDefinition = "TIMESTAMP", nullable = false)
        LocalDate dateMinimum,
        @Column(name = "date_maximum", columnDefinition = "TIMESTAMP", nullable = false)
        LocalDate dateMaximum,
        @Column(name = "value_minimum", nullable = false)
        BigDecimal valueMinimum,
        @Column(name = "value_maximum", nullable = false)
        BigDecimal valueMaximum,
        @Column(name = "rate", nullable = false)
        BigDecimal rate,
        @Column(name = "score_minimum", nullable = false)
        Integer scoreMinimum,
        @Column(name = "score_maximum", nullable = false)
        Integer scoreMaximum) { }
