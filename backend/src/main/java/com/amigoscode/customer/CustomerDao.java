package com.amigoscode.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomerById(Integer id);
    void insertCustomer(Customer customer);
    boolean existsCustomerWithEmail(String email);
    boolean existsCustomerById(Integer customerID);
    void deleteCustomerById(Integer customerId);
    void updateCustomer(Customer customer);
}
