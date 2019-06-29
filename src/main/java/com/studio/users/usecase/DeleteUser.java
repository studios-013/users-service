package com.studio.users.usecase;

import com.studio.users.entity.UserDocument;
import com.studio.users.repository.IUserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteUser {

    @Autowired
    private IUserMongoRepository iUserMongoRepository;

    public void execute(String id) {
        iUserMongoRepository.deleteById(id);
    }
}
