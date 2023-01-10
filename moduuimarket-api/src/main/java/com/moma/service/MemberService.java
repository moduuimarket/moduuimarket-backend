package com.moma.service;

import com.moma.domain.Member;
import com.moma.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void save() {
    }

    public List<Member> findAll() {
        return null;
    }

}
