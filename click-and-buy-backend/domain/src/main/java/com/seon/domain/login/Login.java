package com.seon.domain.login;

import com.seon.domain.annotations.Aggregate;

@Aggregate(id="UserID")
public class Login {
    private UserID userID;
    private Email email;
    private Password password;



}
