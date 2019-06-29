package com.studio.users.repository;

import com.studio.users.domain.User;
import com.studio.users.entity.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserMongoRepository extends MongoRepository<User, String> {
}
