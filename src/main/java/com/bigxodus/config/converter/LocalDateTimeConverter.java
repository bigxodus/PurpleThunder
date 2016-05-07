package com.bigxodus.config.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.*;
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
        if(datetime == null) {
            return null;
        } else {
            Instant instant = datetime.toInstant(ZoneOffset.UTC);
            return Date.from(instant);
        }
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Date value) {
        if(value == null) {
            return null;
        } else {
            Instant instant = Instant.ofEpochMilli(value.getTime());
            return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        }
    }

}