package com.studio.users.controller.json;


import com.studio.users.domain.User;
import lombok.Builder;
import lombok.ToString;

import java.util.UUID;

@Builder
@ToString
public class UserJson {

    private String id;
    private String name;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public User toEntity() {
        return User.builder()
                .id(UUID.randomUUID().toString())
                .name(this.name)
                .email(this.email)
                .build();
    }

    public static UserJson toJson(User user) {
        return UserJson.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }

}
