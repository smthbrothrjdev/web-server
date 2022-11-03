package com.web.server;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path="user")
public interface UserRepo extends JpaRepository<UserEntity, Long> {
}
