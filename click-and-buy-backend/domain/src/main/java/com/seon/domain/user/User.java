package com.seon.domain.user;


import com.seon.domain.annotations.Aggregate;
@Aggregate(id="identityNo")
public class User {
    private IdentityNo identityNo;
    private FullName fullName;
    private Gender gender;
    private Address address;
    private Phone phone;
    private Role role;





}
