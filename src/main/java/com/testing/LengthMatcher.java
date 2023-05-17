package com.testing;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class LengthMatcher extends FeatureMatcher<String, Integer> {

    public LengthMatcher(Matcher<? super Integer> subMatcher, String featureDescription, String mismatchDescription) {
        super(subMatcher, featureDescription, mismatchDescription);
    }

    @Override
    protected Integer featureValueOf(String actual) {
        return actual.length();
    }
}

