package com.example.myapplication;

import android.widget.TextView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoNPETest {
    @Mock
    private TextView txtNextStep;

    @InjectMocks
    private MockitoNPE objectUnderTest;

    @Test
    public void testName() throws Exception {
        objectUnderTest.stuff();
    }
}
