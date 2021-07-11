package com.example.usermanagement.service;

import com.example.usermanagement.domain.User;
import com.example.usermanagement.repository.MemoryUserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    MemoryUserRepository memberRepository;
    UserService memberService;

    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryUserRepository();
        memberService = new UserService(memberRepository);
    }

    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void findOne() {
        // given
        User user = new User();
        user.setName("hello");

        // when
        Long saveId = memberService.join(user);

        // then
        User findMember = memberService.findOne(saveId).get();
        assertThat(user.getName()).isEqualTo(findMember.getName());
    }

    @Test
    void join() {
        // given
        User user1 = new User();
        user1.setName("spring");

        User user2 = new User();
        user2.setName("spring");

        // when
        memberService.join(user1);

        // then
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> memberService.join(user2));
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
    }
}