package com.github.fabriciolfj.accountservice.interfaceadapter.repository.account;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface AccountRepository extends ReactiveCrudRepository<AccountEntity, Long> {

    Mono<AccountEntity> findByCode(final String code);

    Mono<AccountEntity> findByCpf(final String cpf);
}
