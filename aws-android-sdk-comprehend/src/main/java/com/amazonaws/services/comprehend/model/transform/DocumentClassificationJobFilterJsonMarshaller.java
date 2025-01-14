/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DocumentClassificationJobFilter
 */
class DocumentClassificationJobFilterJsonMarshaller {

    public void marshall(DocumentClassificationJobFilter documentClassificationJobFilter,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (documentClassificationJobFilter.getJobName() != null) {
            String jobName = documentClassificationJobFilter.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (documentClassificationJobFilter.getJobStatus() != null) {
            String jobStatus = documentClassificationJobFilter.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (documentClassificationJobFilter.getSubmitTimeBefore() != null) {
            java.util.Date submitTimeBefore = documentClassificationJobFilter.getSubmitTimeBefore();
            jsonWriter.name("SubmitTimeBefore");
            jsonWriter.value(submitTimeBefore);
        }
        if (documentClassificationJobFilter.getSubmitTimeAfter() != null) {
            java.util.Date submitTimeAfter = documentClassificationJobFilter.getSubmitTimeAfter();
            jsonWriter.name("SubmitTimeAfter");
            jsonWriter.value(submitTimeAfter);
        }
        jsonWriter.endObject();
    }

    private static DocumentClassificationJobFilterJsonMarshaller instance;

    public static DocumentClassificationJobFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentClassificationJobFilterJsonMarshaller();
        return instance;
    }
}
