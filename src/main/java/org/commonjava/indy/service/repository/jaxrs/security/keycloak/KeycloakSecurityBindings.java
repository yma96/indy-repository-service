/**
 * Copyright (C) 2020 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.commonjava.indy.service.repository.jaxrs.security.keycloak;

import javax.enterprise.inject.Alternative;
import javax.inject.Named;
import java.util.List;

@Alternative
@Named
public class KeycloakSecurityBindings
{

    private List<KeycloakSecurityConstraint> constraints;

    public List<KeycloakSecurityConstraint> getConstraints()
    {
        return constraints;
    }

    public void setConstraints( final List<KeycloakSecurityConstraint> securityContraints )
    {
        this.constraints = securityContraints;
    }

}

