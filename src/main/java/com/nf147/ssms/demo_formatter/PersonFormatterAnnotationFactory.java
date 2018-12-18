package com.nf147.ssms.demo_formatter;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Formatter;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import java.util.HashSet;
import java.util.Set;

/**
 *
 @RequestMapping(method = RequestMethod.GET)
 public Person home (@RequestParam(value = "id", required = false) @PersonFromId("en") Person person) {
     return person;
 }

 */

public class PersonFormatterAnnotationFactory implements AnnotationFormatterFactory<PersonFromId> {
    @Override
    public Set<Class<?>> getFieldTypes() {
        HashSet<Class<?>> types = new HashSet<>();
        types.add(Person.class);
        return types;
    }

    @Override
    public Printer<?> getPrinter(PersonFromId annotation, Class<?> fieldType) {
        return null;
    }

    @Override
    public Parser<?> getParser(PersonFromId annotation, Class<?> fieldType) {
        return getFormatter(annotation);
    }

    private Formatter getFormatter(PersonFromId annotation) {
        PersonFormatter formatter = new PersonFormatter();
        formatter.setStyle(annotation.value());
        return formatter;
    }
}
