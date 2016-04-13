package com.bigxodus.config;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author: Lawrence
 * @since: 2016. 4. 13.
 * @note:
 */
@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Date> {

    @Override
    public Date convertToDatabaseColumn(LocalDateTime datetime) {
        Instant instant = Instant.from(datetime);
        return Date.from(instant);
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Date value) {
        Instant instant = Instant.ofEpochMilli(value.getTime());
        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }

}