/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ExpenseDetection
 */
class ExpenseDetectionJsonMarshaller {

    public void marshall(ExpenseDetection expenseDetection, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (expenseDetection.getText() != null) {
            String text = expenseDetection.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (expenseDetection.getGeometry() != null) {
            Geometry geometry = expenseDetection.getGeometry();
            jsonWriter.name("Geometry");
            GeometryJsonMarshaller.getInstance().marshall(geometry, jsonWriter);
        }
        if (expenseDetection.getConfidence() != null) {
            Float confidence = expenseDetection.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        jsonWriter.endObject();
    }

    private static ExpenseDetectionJsonMarshaller instance;

    public static ExpenseDetectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExpenseDetectionJsonMarshaller();
        return instance;
    }
}
