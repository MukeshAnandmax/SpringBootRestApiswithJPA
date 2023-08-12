package com.practice.restapijpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BankController {


@Autowired
BankRepository bankRepository;

    @GetMapping(value = "get_banks")
    public List<Bank> getBanks(){

        return bankRepository.findAll();
    }


    @GetMapping(value = "/get_bank")
    public Bank getBank(@RequestParam("id") int id){
       return  bankRepository.findByBankId(id);
    }

    @PostMapping(value = "/insert_bank")
    public void addBank(@RequestBody Bank bank){

        bankRepository.save(bank);
    }

    @PostMapping(value = "/insert_banks")
    public void addBanks(@RequestBody List<Bank> banks){

        bankRepository.saveAll(banks);
    }

}
