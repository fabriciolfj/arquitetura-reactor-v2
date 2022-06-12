package com.github.fabriciolfj.engineruleservice.exceptions.enums;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

public enum Errors {

    ERROR_01;

    public String getMessage() {
        var msg = messageException()
                .getMessage(this.name() + ".message", null, LocaleContextHolder.getLocale());

        return msg;
    }

    private static MessageSource messageException() {
        final ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:exceptions");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
