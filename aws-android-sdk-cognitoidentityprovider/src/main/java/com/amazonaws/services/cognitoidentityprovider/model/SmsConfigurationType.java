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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The SMS configuration type that includes the settings the Amazon Cognito User
 * Pool must call for the Amazon Simple Notification Service service to send an
 * SMS message from your Amazon Web Services account. The Amazon Cognito User
 * Pool makes the request to the Amazon SNS Service by using an Identity and
 * Access Management role that you provide for your Amazon Web Services account.
 * </p>
 */
public class SmsConfigurationType implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS caller. This is the ARN
     * of the IAM role in your Amazon Web Services account that Amazon Cognito
     * will use to send SMS messages. SMS messages are subject to a <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html"
     * >spending limit</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String snsCallerArn;

    /**
     * <p>
     * The external ID is a value that you should use to add security to your
     * IAM role that is used to call Amazon SNS to send SMS messages for your
     * user pool. If you provide an <code>ExternalId</code>, the Amazon Cognito
     * User Pool will include it when attempting to assume your IAM role so that
     * you can set your roles trust policy to require the
     * <code>ExternalID</code>. If you use the Amazon Cognito Management Console
     * to create a role for SMS multi-factor authentication (MFA), Amazon
     * Cognito will create a role with the required permissions and a trust
     * policy that demonstrates use of the <code>ExternalId</code>.
     * </p>
     * <p>
     * For more information about the <code>ExternalId</code> of a role, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to use an external ID when granting access to your Amazon Web
     * Services resources to a third party</a>
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS caller. This is the ARN
     * of the IAM role in your Amazon Web Services account that Amazon Cognito
     * will use to send SMS messages. SMS messages are subject to a <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html"
     * >spending limit</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon SNS caller. This is
     *         the ARN of the IAM role in your Amazon Web Services account that
     *         Amazon Cognito will use to send SMS messages. SMS messages are
     *         subject to a <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html"
     *         >spending limit</a>.
     *         </p>
     */
    public String getSnsCallerArn() {
        return snsCallerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS caller. This is the ARN
     * of the IAM role in your Amazon Web Services account that Amazon Cognito
     * will use to send SMS messages. SMS messages are subject to a <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html"
     * >spending limit</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param snsCallerArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon SNS caller. This
     *            is the ARN of the IAM role in your Amazon Web Services account
     *            that Amazon Cognito will use to send SMS messages. SMS
     *            messages are subject to a <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html"
     *            >spending limit</a>.
     *            </p>
     */
    public void setSnsCallerArn(String snsCallerArn) {
        this.snsCallerArn = snsCallerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS caller. This is the ARN
     * of the IAM role in your Amazon Web Services account that Amazon Cognito
     * will use to send SMS messages. SMS messages are subject to a <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html"
     * >spending limit</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param snsCallerArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon SNS caller. This
     *            is the ARN of the IAM role in your Amazon Web Services account
     *            that Amazon Cognito will use to send SMS messages. SMS
     *            messages are subject to a <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html"
     *            >spending limit</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SmsConfigurationType withSnsCallerArn(String snsCallerArn) {
        this.snsCallerArn = snsCallerArn;
        return this;
    }

    /**
     * <p>
     * The external ID is a value that you should use to add security to your
     * IAM role that is used to call Amazon SNS to send SMS messages for your
     * user pool. If you provide an <code>ExternalId</code>, the Amazon Cognito
     * User Pool will include it when attempting to assume your IAM role so that
     * you can set your roles trust policy to require the
     * <code>ExternalID</code>. If you use the Amazon Cognito Management Console
     * to create a role for SMS multi-factor authentication (MFA), Amazon
     * Cognito will create a role with the required permissions and a trust
     * policy that demonstrates use of the <code>ExternalId</code>.
     * </p>
     * <p>
     * For more information about the <code>ExternalId</code> of a role, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to use an external ID when granting access to your Amazon Web
     * Services resources to a third party</a>
     * </p>
     *
     * @return <p>
     *         The external ID is a value that you should use to add security to
     *         your IAM role that is used to call Amazon SNS to send SMS
     *         messages for your user pool. If you provide an
     *         <code>ExternalId</code>, the Amazon Cognito User Pool will
     *         include it when attempting to assume your IAM role so that you
     *         can set your roles trust policy to require the
     *         <code>ExternalID</code>. If you use the Amazon Cognito Management
     *         Console to create a role for SMS multi-factor authentication
     *         (MFA), Amazon Cognito will create a role with the required
     *         permissions and a trust policy that demonstrates use of the
     *         <code>ExternalId</code>.
     *         </p>
     *         <p>
     *         For more information about the <code>ExternalId</code> of a role,
     *         see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     *         >How to use an external ID when granting access to your Amazon
     *         Web Services resources to a third party</a>
     *         </p>
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * <p>
     * The external ID is a value that you should use to add security to your
     * IAM role that is used to call Amazon SNS to send SMS messages for your
     * user pool. If you provide an <code>ExternalId</code>, the Amazon Cognito
     * User Pool will include it when attempting to assume your IAM role so that
     * you can set your roles trust policy to require the
     * <code>ExternalID</code>. If you use the Amazon Cognito Management Console
     * to create a role for SMS multi-factor authentication (MFA), Amazon
     * Cognito will create a role with the required permissions and a trust
     * policy that demonstrates use of the <code>ExternalId</code>.
     * </p>
     * <p>
     * For more information about the <code>ExternalId</code> of a role, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to use an external ID when granting access to your Amazon Web
     * Services resources to a third party</a>
     * </p>
     *
     * @param externalId <p>
     *            The external ID is a value that you should use to add security
     *            to your IAM role that is used to call Amazon SNS to send SMS
     *            messages for your user pool. If you provide an
     *            <code>ExternalId</code>, the Amazon Cognito User Pool will
     *            include it when attempting to assume your IAM role so that you
     *            can set your roles trust policy to require the
     *            <code>ExternalID</code>. If you use the Amazon Cognito
     *            Management Console to create a role for SMS multi-factor
     *            authentication (MFA), Amazon Cognito will create a role with
     *            the required permissions and a trust policy that demonstrates
     *            use of the <code>ExternalId</code>.
     *            </p>
     *            <p>
     *            For more information about the <code>ExternalId</code> of a
     *            role, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     *            >How to use an external ID when granting access to your Amazon
     *            Web Services resources to a third party</a>
     *            </p>
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID is a value that you should use to add security to your
     * IAM role that is used to call Amazon SNS to send SMS messages for your
     * user pool. If you provide an <code>ExternalId</code>, the Amazon Cognito
     * User Pool will include it when attempting to assume your IAM role so that
     * you can set your roles trust policy to require the
     * <code>ExternalID</code>. If you use the Amazon Cognito Management Console
     * to create a role for SMS multi-factor authentication (MFA), Amazon
     * Cognito will create a role with the required permissions and a trust
     * policy that demonstrates use of the <code>ExternalId</code>.
     * </p>
     * <p>
     * For more information about the <code>ExternalId</code> of a role, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to use an external ID when granting access to your Amazon Web
     * Services resources to a third party</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalId <p>
     *            The external ID is a value that you should use to add security
     *            to your IAM role that is used to call Amazon SNS to send SMS
     *            messages for your user pool. If you provide an
     *            <code>ExternalId</code>, the Amazon Cognito User Pool will
     *            include it when attempting to assume your IAM role so that you
     *            can set your roles trust policy to require the
     *            <code>ExternalID</code>. If you use the Amazon Cognito
     *            Management Console to create a role for SMS multi-factor
     *            authentication (MFA), Amazon Cognito will create a role with
     *            the required permissions and a trust policy that demonstrates
     *            use of the <code>ExternalId</code>.
     *            </p>
     *            <p>
     *            For more information about the <code>ExternalId</code> of a
     *            role, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     *            >How to use an external ID when granting access to your Amazon
     *            Web Services resources to a third party</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SmsConfigurationType withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSnsCallerArn() != null)
            sb.append("SnsCallerArn: " + getSnsCallerArn() + ",");
        if (getExternalId() != null)
            sb.append("ExternalId: " + getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSnsCallerArn() == null) ? 0 : getSnsCallerArn().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SmsConfigurationType == false)
            return false;
        SmsConfigurationType other = (SmsConfigurationType) obj;

        if (other.getSnsCallerArn() == null ^ this.getSnsCallerArn() == null)
            return false;
        if (other.getSnsCallerArn() != null
                && other.getSnsCallerArn().equals(this.getSnsCallerArn()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null
                && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        return true;
    }
}
