package com.projectone.one.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Repository;

@Repository
@Getter
@Builder
@ToString
public class User {

    private long userNum;
    private String id;
    private String password;

}


