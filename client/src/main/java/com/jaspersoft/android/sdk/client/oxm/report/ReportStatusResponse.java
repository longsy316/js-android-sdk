/*
 * Copyright (C) 2015 TIBCO Jaspersoft Corporation. All rights reserved.
 * http://community.jaspersoft.com/project/mobile-sdk-android
 *
 * Unless you have purchased a commercial license agreement from TIBCO Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of TIBCO Jaspersoft Mobile SDK for Android.
 *
 * TIBCO Jaspersoft Mobile SDK is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TIBCO Jaspersoft Mobile SDK is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with TIBCO Jaspersoft Mobile SDK for Android. If not, see
 * <http://www.gnu.org/licenses/lgpl>.
 */

package com.jaspersoft.android.sdk.client.oxm.report;

import com.google.gson.annotations.Expose;
import com.jaspersoft.android.sdk.client.oxm.converter.ReportStatusConverter;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/**
 * @author Tom Koptel
 * @since 1.9
 */
@Root(name = "status")
@Convert(ReportStatusConverter.class)
public class ReportStatusResponse {

    @Expose
    @Element(required = false)
    private String value;

    /**
     * Otherwise, the framework cannot instantiate the class for deserialization.
     *
     * http://stackoverflow.com/questions/7470992/exception-with-simple-xml-framework-deserialization
     */
    public ReportStatusResponse() {
    }

    public ReportStatusResponse(String status) {
        value = status;
    }

    public ReportStatus getReportStatus() {
        return ReportStatus.valueOf(value);
    }

    public String getStatus() {
        return value;
    }

    public void setStatus(String status) {
        this.value = status;
    }
}
