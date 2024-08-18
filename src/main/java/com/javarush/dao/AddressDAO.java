package com.javarush.dao;

import com.javarush.entity.Address;
import org.hibernate.SessionFactory;

public class AddressDAO extends GenericDAO<Address> {

    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
