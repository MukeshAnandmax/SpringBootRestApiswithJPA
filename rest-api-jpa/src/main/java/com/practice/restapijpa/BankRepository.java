package com.practice.restapijpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BankRepository extends JpaRepository<Bank,Integer> {

    @Query(value = "select * from bank b where b.bank_id=:bankId",nativeQuery = true)
    public  Bank findByBankId(int bankId);


    @Query(value = "select b from Bank b")
    public List<Bank> getAllBank();


}
