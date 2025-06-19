package com.eventostec.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventostec.api.domain.address.Address;

public interface AddressRepositoy extends JpaRepository<Address, UUID>{
    
}
