package com.moma.service;

import com.moma.domain.User;
import com.moma.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void save() {
    }

    public List<User> findAll() {
        return null;
    }

}
