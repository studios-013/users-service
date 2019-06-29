package com.studio.users.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class UserDocument {

    @Id
    String id;
    String name;
    String email;

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
