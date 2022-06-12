package com.github.fabriciolfj.engineruleservice.business.usecase.validation;

import com.github.fabriciolfj.engineruleservice.business.usecase.ValidationRate;
import com.github.fabriciolfj.engineruleservice.commands.RuleRateCommand;
import com.github.fabriciolfj.engineruleservice.entities.RuleRate;
import com.github.fabriciolfj.engineruleservice.exceptions.BusinessRateNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class ValidationRateValue implements ValidationRate {

    private final ValidationRateScore validationRateScore;

    @Override
    public RuleRate execute(final List<RuleRate> rules, final RuleRateCommand command) {
        log.info("Validation value to command: {}", command);
        final var result = rules
                .stream()
                .filter(r -> r.isValueValid(command.value()))
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            throw new BusinessRateNotFoundException();
        }

        return validationRateScore.execute(result, command);
    }
}
