/**
 * Copyright (C) 2011-2022 Red Hat, Inc. (https://github.com/Commonjava/service-parent)
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
package org.commonjava.indy.service.repository.jaxrs;

import io.quarkus.test.junit.QuarkusTestProfile;
import org.commonjava.indy.service.repository.ftests.profile.MemoryFunctionProfile;
import org.commonjava.indy.service.repository.jaxrs.mock.MockAdminController;
import org.commonjava.indy.service.repository.jaxrs.mock.MockSecurityManager;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MockTestProfile
        extends MemoryFunctionProfile
{
    @Override
    public Set<Class<?>> getEnabledAlternatives()
    {
        return Stream.of( MockAdminController.class, MockSecurityManager.class ).collect( Collectors.toSet() );
    }

}
