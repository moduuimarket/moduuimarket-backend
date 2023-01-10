package com.moma.repository;

import com.moma.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void add() {
        // given
        memberRepository.save(new Member(1L, "userA"));

        // when
        Member saved = memberRepository.findById(1L)
                .orElse(null);

        // then
        assertThat(saved).isNotNull();
        assertThat(saved.getId()).isEqualTo(1L);
    }

}
