/*
 * Copyright © 2015 TIBCO Software, Inc. All rights reserved.
 * http://community.jaspersoft.com/project/jaspermobile-android
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of Jaspersoft Mobile for Android.
 *
 * Jaspersoft Mobile is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Jaspersoft Mobile is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Jaspersoft Mobile for Android. If not, see
 * <http://www.gnu.org/licenses/lgpl>.
 */

package com.jaspersoft.android.sdk.test.matcher;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author Tom Koptel
 * @since 2.0
 */
public final class HasAnnotation extends TypeSafeMatcher<Field> {
    private final Class<? extends Annotation> mAnnotationClass;

    private HasAnnotation(Class<? extends Annotation> annotationClass) {
        mAnnotationClass = annotationClass;
    }

    @Override
    protected boolean matchesSafely(Field item) {
        Annotation annotation = item.getAnnotation(mAnnotationClass);
        return annotation != null;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("is not annotated with " + mAnnotationClass);
    }

    @Factory
    public static <T> Matcher<Field> hasAnnotation(Class<? extends Annotation> annotationClass) {
        return new HasAnnotation(annotationClass);
    }
}