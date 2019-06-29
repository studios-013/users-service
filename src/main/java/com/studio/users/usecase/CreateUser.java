package com.studio.users.usecase;

import com.studio.users.domain.User;
import com.studio.users.repository.IUserMongoRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateUser {

    private IUserMongoRepository iUserMongoRepository;

    public CreateUser(IUserMongoRepository iUserMongoRepository) {
        this.iUserMongoRepository = iUserMongoRepository;
    }

    public User execute(User user) {
        return iUserMongoRepository.save(user);
    }
}
