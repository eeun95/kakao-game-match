package com.test.kakaogamematch.service;

import com.test.kakaogamematch.response.InitResponse;
import org.springframework.stereotype.Service;

@Service
public class InitService {

    public InitResponse start(int problem) {
        InitResponse response = InitResponse.builder()
                .authKey(null)
                .problem(problem)
                .time(0)
                .build();

        return response;
    }
}
