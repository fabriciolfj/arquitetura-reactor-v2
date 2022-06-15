package com.github.fabriciolfj.engineruleservice.interfaceadapter.gateway;

import com.github.fabriciolfj.engineruleservice.business.FindRules;
import com.github.fabriciolfj.engineruleservice.entities.RuleRate;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class RuleRateGateway implements FindRules {

    @Override
    public List<RuleRate> find(LocalDate birthday) {
        return null;
    }
}
