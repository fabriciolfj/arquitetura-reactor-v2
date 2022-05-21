package com.github.fabriciolfj.accountservice.interfaceadapter.repository.mapper;

import com.github.fabriciolfj.accountservice.domain.Account;
import com.github.fabriciolfj.accountservice.interfaceadapter.repository.account.AccountEntity;

public class AccountEntityMapper {

    private AccountEntityMapper() {

    }

    public static final Account toDomain(final AccountEntity entity) {
        return Account.builder()
                .code(entity.getCode())
                .cpf(entity.getCpf())
                .product(entity.getProduct())
                .build();
    }

    public static final AccountEntity toEntity(final Account account) {
        return AccountEntity.builder()
                .code(account.getCode())
                .cpf(account.getCpf())
                .product(account.getProduct())
                .build();
    }
}
