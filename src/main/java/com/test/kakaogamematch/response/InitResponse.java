package com.test.kakaogamematch.response;

import lombok.Builder;

@Builder
public class InitResponse {

    private String authKey;

    private int problem;

    private int time;
}
