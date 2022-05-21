package com.github.fabriciolfj.accountservice.interfaceadapter.repository.account;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("conta")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AccountEntity {

    @EqualsAndHashCode.Include
    @Id
    private Long id;
    private String code;
    private String cpf;
    private String product;
}
