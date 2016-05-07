package com.bigxodus.config.converter;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author: Lawrence
 * @since: 2016. 4. 13.
 * @note:
 */
@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

    @Override
    public Date convertToDatabaseColumn(LocalDate localDate) {
        if (localDate == null) {
            return null;
        } else {
            Instant instant = Instant.from(localDate);
            return Date.from(instant);
        }
    }

    @Override
    public LocalDate convertToEntityAttribute(Date value) {
        if (value == null) {
            return null;
        } else {
            Instant instant = value.toInstant();
            return LocalDate.from(instant);
        }
    }

}