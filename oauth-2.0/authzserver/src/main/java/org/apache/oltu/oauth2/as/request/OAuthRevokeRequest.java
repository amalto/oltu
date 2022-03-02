/**
 * Copyright 2010 Newcastle University
 * <p>
 * http://research.ncl.ac.uk/smart/
 * <p>
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.oltu.oauth2.as.request;

import org.apache.oltu.oauth2.as.validator.RevokeValidator;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.validators.OAuthValidator;

import javax.servlet.http.HttpServletRequest;


/**
 * The Default OAuth Authorization Server class that validates whether a given HttpServletRequest is a valid
 * OAuth Revoke request.
 * <p/>
 * IMPORTANT: This OAuthRevokeRequest assumes that a revoke request requires client authentication.
 * Please see section 3.2.1 of the OAuth Specification: http://tools.ietf.org/html/rfc6749#section-3.2.1
 */
public class OAuthRevokeRequest extends OAuthRequest {

    /**
     * Create an OAuth Revoke request from a given HttpSerlvetRequest
     *
     * @param request the httpservletrequest that is validated and transformed into the OAuth Revoke Request
     * @throws OAuthSystemException  if an unexpected exception was thrown
     * @throws OAuthProblemException if the request was not a valid Revoke request this exception is thrown.
     */
    public OAuthRevokeRequest(HttpServletRequest request) throws OAuthSystemException, OAuthProblemException {
        super(request);
    }

    @Override
    protected OAuthValidator<HttpServletRequest> initValidator() {
        return new RevokeValidator();
    }

    public String getToken() {
        return getParam(OAuth.OAUTH_REVOKE_TOKEN);
    }

    public String getTokenTypeHint() {
        return getParam(OAuth.OAUTH_TOKEN_TYPE_HINT);
    }
}
