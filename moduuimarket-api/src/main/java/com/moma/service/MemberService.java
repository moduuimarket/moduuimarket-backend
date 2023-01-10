package com.moma.service;

import com.moma.domain.Member;
import com.moma.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    public String get() {
        return "test";
    }

    @Transactional
    public void save(Member member) {

    }

}
