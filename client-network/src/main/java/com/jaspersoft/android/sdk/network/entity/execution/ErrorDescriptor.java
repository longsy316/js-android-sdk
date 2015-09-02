/*
 * Copyright � 2015 TIBCO Software, Inc. All rights reserved.
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

package com.jaspersoft.android.sdk.network.entity.execution;

import com.google.gson.annotations.Expose;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/**
 * @author Tom Koptel
 * @since 2.0
 */
public final class ErrorDescriptor {
    @Expose
    private String errorCode;
    @Expose
    private String message;
    @Expose
    private Set<String> parameters = Collections.emptySet();

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

    public Set<String> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "ErrorDescriptor{" +
                "errorCode='" + errorCode + '\'' +
                ", message='" + message + '\'' +
                ", parameters=" + Arrays.toString(parameters.toArray()) +
                '}';
    }
}
