<form id="confirmationForm" name="confirmationForm" action="authorize" method="post">
    <input name="user_oauth_approval" value="true" type="hidden" />
    <p>
                        Do you authorize "${authorizationRequest.clientId}" at "${authorizationRequest.redirectUri}" to access your protected resources:
                    <ul>
                        <#list authorizationRequest.scope as scope>
                            <li>
                                <div class="form-group">
                                    ${scope} :
                                    <input type="radio" name="scope.${scope}" value="true" checked>
                                    Approve
                                    <input type="radio" name="scope.${scope}" value="false">
                                    Deny
                                </div>
                            </li>
                        </#list>
                    </ul>

                    </p>
    <button class="btn btn-primary" type="submit">Approve</button>
</form>