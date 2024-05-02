package com.aps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aps.entity.BookingDtls;
import com.aps.entity.PaymentDtls;
import com.aps.entity.UserDtls;


public interface UserRepository extends JpaRepository<UserDtls, Integer>{

	void save(BookingDtls b);

	void save(PaymentDtls p);

}
