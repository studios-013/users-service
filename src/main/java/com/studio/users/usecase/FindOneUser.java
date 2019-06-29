package com.studio.users.usecase;

import com.studio.users.domain.User;
import com.studio.users.entity.UserDocument;
import com.studio.users.repository.IUserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindOneUser {

    @Autowired
    private IUserMongoRepository iUserMongoRepository;

    public User execute(String id) {

        return iUserMongoRepository.findById(id).get();
    }
}
