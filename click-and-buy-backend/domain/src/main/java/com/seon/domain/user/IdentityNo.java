package com.seon.domain.user;

import java.util.Objects;

public final class IdentityNo {
    private final String value;

    public IdentityNo(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdentityNo that = (IdentityNo) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "IdentityNo{" +
                "value='" + value + '\'' +
                '}';
    }
}
