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

package com.jaspersoft.android.sdk.service.server;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * @author Tom Koptel
 * @since 2.0
 */
public class ServerSessionTest {

    @Mock
    TokenProvider mTokenProvider;
    @Mock
    InfoProvider mInfoProvider;

    String serverUrl = "http://localhost";

    private ServerSession objectUnderTest;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        objectUnderTest = new ServerSession(serverUrl, mTokenProvider, mInfoProvider);
    }

    @Test
    public void sessionShouldProvideInfo() {
        objectUnderTest.getInfo();
        verify(mInfoProvider, times(1)).provideInfo();
    }

    @Test
    public void sessionShouldProvideToken() {
        objectUnderTest.getToken();
        verify(mTokenProvider, times(1)).provideToken();
    }

}
