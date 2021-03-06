package com.example.demo;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FTUserService {

    @Autowired
    private FTUserRepository repo;

    public List<FTUser> listAll() {
        return repo.findAll();
    }

    public void save(FTUser user) {
        repo.save(user);
    }

    public User get(String mode) {
        return repo.findByDtype(mode); //findByDtype: the default method to find a sub-type
    }
        
    public void delete(String name) {
        repo.deleteByUsername(name); //username - primary key in the User table
    }          
}

