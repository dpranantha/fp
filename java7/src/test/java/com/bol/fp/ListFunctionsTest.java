package com.bol.fp;

import com.google.common.collect.ImmutableList;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class ListFunctionsTest {

    @Test
    public void calculates_the_sum_of_just_one_integer() {
        assertThat(ListFunctions.sum(ImmutableList.of(1)), is(1));
    }

    @Test
    public void calculate_the_sum_of_a_list_of_integers() {
        assertThat(ListFunctions.sum(ImmutableList.of(1, 2, 3, 4)), is(10));
    }

    @Test
    public void calculate_the_sum_of_a_list_containing_negative_integers() {
        assertThat(ListFunctions.sum(ImmutableList.of(-2, -5)), is(-7));
    }
}
