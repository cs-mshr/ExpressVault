package com.example.LockerSystem.Service;

import com.example.LockerSystem.Dao.customerDao;
import com.example.LockerSystem.Entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private customerDao dao;
    @Override
    public Customer addCustomer(Customer customer) {
        customer.setCreatedAT(LocalDateTime.now());
        customer.setUpdatedAT(LocalDateTime.now());
        return dao.save(customer);
    }
}
