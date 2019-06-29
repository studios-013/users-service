package com.studio.users.usecase;

import com.studio.users.domain.User;
import com.studio.users.entity.UserDocument;
import com.studio.users.repository.IUserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindAllUser {

    @Autowired
    private IUserMongoRepository iUserMongoRepository;

    public List<User> execute() {
        return iUserMongoRepository.findAll();
    }
}
