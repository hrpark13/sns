package com.fastcampus.snsproject.service;

import com.fastcampus.snsproject.repository.PostEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostEntityRepository postEntityRepository;


    @Transactional
    public void create(String title, String body, String userName) {

        // user find

        // post save

        // return

    }
}
