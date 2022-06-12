package com.github.fabriciolfj.engineruleservice.entities;

import org.apache.tomcat.jni.Local;

import java.math.BigDecimal;
import java.time.LocalDate;

public record RuleRate(
        LocalDate dateMinimum,
        LocalDate dateMaximum,
        BigDecimal valueMinimum,
        BigDecimal valueMaximum,
        BigDecimal rate,
        Integer scoreMinimum,
        Integer scoreMaximum) {

    private static final Integer VALUE_COMPARATOR = 0;

    public boolean isValueValid(final BigDecimal value) {
        return valueMinimum.compareTo(value) >= VALUE_COMPARATOR && valueMaximum.compareTo(value) <= VALUE_COMPARATOR;
    }

    public boolean isScoreValid(final Integer value) {
        return scoreMinimum >= value  && scoreMaximum <= value;
    }
}
