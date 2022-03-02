package org.apache.oltu.oauth2.as.validator;

import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.error.OAuthError;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.validators.AbstractValidator;

import javax.servlet.http.HttpServletRequest;

public class RevokeValidator extends AbstractValidator<HttpServletRequest> {

    public RevokeValidator() {
        requiredParams.add(OAuth.OAUTH_REVOKE_TOKEN);

        enforceClientAuthentication = true;
    }

    @Override
    public void validateMethod(HttpServletRequest request) throws OAuthProblemException {
        String method = request.getMethod();
        if (!OAuth.HttpMethod.POST.equals(method)) {
            throw OAuthProblemException.error(OAuthError.CodeResponse.INVALID_REQUEST)
                    .description("Method not correct.");
        }
    }

    @Override
    public void validateContentType(HttpServletRequest request) {
    }
}
