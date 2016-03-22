package com.jaspersoft.android.sdk.network.entity.dashboard;

import com.google.gson.annotations.Expose;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;

import static com.jaspersoft.android.sdk.test.matcher.HasAnnotation.hasAnnotation;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class InputControlDashboardComponentTest {
    @Test
    @Parameters({
            "label",
            "ownerResourceId",
            "ownerResourceParameterName",
            "parentId",
            "resource",
            "position",
    })
    public void shouldHaveExposeAnnotationForField(String fieldName) throws NoSuchFieldException {
        Field field = InputControlDashboardComponent.class.getDeclaredField(fieldName);
        assertThat(field, hasAnnotation(Expose.class));
    }
}