package com.example.usermanagement.service;

import com.example.usermanagement.domain.User;
import com.example.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    /**
     * 회원가입
     */
    public Long join(User user) {
        // 중복 회원 검증
        validateDuplicateMember(user);
        userRepository.save(user);
        return user.getId();
    }

    private void validateDuplicateMember(User user) {
        userRepository.findByName(user.getName())
                .ifPresent(m -> {
                    throw new IllegalArgumentException("이미 존재하는 회원입니다.");
                });
    }

    /**
     * 회원 조회
     */
    public List<User> findMembers() {
        return userRepository.findAll();
    }
    public Optional<User> findOne(Long userId) {
        return userRepository.findById(userId);
    }
}
