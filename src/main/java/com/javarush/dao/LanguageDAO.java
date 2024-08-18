package com.javarush.dao;

import com.javarush.entity.Language;
import org.hibernate.SessionFactory;

public class LanguageDAO extends GenericDAO <Language> {
    public LanguageDAO(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}
