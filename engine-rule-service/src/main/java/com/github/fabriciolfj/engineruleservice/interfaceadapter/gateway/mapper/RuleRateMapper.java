package com.github.fabriciolfj.engineruleservice.interfaceadapter.gateway.mapper;

import com.github.fabriciolfj.engineruleservice.entities.RuleRate;
import com.github.fabriciolfj.engineruleservice.interfaceadapter.repository.rulerate.RuleRateData;

public class RuleRateMapper {

    private RuleRateMapper() {
        throw new IllegalArgumentException();
    }

    public static RuleRate toDomain(final RuleRateData data) {
        return RuleRate.builder()
                .dateMaximum(data.dateMaximum())
                .dateMinimum(data.dateMinimum())
                .rate(data.rate())
                .scoreMaximum(data.scoreMaximum())
                .scoreMinimum(data.scoreMinimum())
                .valueMaximum(data.valueMaximum())
                .valueMinimum(data.valueMinimum())
                .build();
    }
}
