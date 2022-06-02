package com.DEMOJWT.demo.services;

import com.DEMOJWT.demo.dto.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class UserServiceImpl implements UserService{


    @Override
    public Flux<User> findAll() {
        return null;
    }

    @Override
    public Mono<User> save(User user) {
        return null;
    }
}
