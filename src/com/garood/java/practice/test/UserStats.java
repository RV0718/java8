package com.garood.java.practice.test;

import java.util.Optional;

public class UserStats {

    private Optional<Long> visitCount;

    public Optional<Long> getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Optional<Long> visitCount) {
        this.visitCount = visitCount;
    }
}
