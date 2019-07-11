package com.studio.users.usecase;

import com.studio.users.domain.User;
import com.studio.users.repository.IUserMongoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CreateUser {

    private IUserMongoRepository iUserMongoRepository;
    private final Logger log = LoggerFactory.getLogger(CreateUser.class);


    public CreateUser(IUserMongoRepository iUserMongoRepository) {
        this.iUserMongoRepository = iUserMongoRepository;
    }

    public User execute(User user) {
        log.info("creating an user " + user.getName());
        return iUserMongoRepository.save(user);
    }
}
