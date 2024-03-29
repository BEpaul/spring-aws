package com.SpringAWS.study.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 사용자");

    private final String key;
    private final String title;
}

/**
 * 스프링 시큐리티 권한 코드에는 항상 ROLE_이 앞에 있어야함
 */