package org.apache.oltu.oauth2.as.validator;

import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.error.OAuthError;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.validators.AbstractValidator;

import javax.servlet.http.HttpServletRequest;

public class TokenExchangeValidator extends AbstractValidator<HttpServletRequest> {

    public TokenExchangeValidator() {
        requiredParams.add(OAuth.OAUTH_SUBJECT_TOKEN);
        requiredParams.add(OAuth.OAUTH_SUBJECT_TOKEN_TYPE);
    }

    @Override
    public void validateMethod(HttpServletRequest request) throws OAuthProblemException {
        String method = request.getMethod();
        if (!OAuth.HttpMethod.POST.equals(method)) {
            throw OAuthProblemException.error(OAuthError.CodeResponse.INVALID_REQUEST)
                    .description("Method not correct.");
        }
    }
}
