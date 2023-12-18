package com.example.customer_front_thymleaf_app.repositoy;

import com.example.customer_front_thymleaf_app.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
