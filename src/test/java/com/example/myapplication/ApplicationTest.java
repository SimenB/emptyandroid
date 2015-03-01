package com.example.myapplication;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ApplicationTest {
    @Test
    public void test() {
        assertThat(1 + 1, is(equalTo(2)));
    }
}