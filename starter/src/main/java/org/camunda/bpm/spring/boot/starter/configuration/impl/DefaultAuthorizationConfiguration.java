/*
 * Copyright © 2015-2018 camunda services GmbH and various authors (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.spring.boot.starter.configuration.impl;

import org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration;
import org.camunda.bpm.spring.boot.starter.property.AuthorizationProperty;
import org.camunda.bpm.spring.boot.starter.configuration.CamundaAuthorizationConfiguration;

public class DefaultAuthorizationConfiguration extends AbstractCamundaConfiguration implements CamundaAuthorizationConfiguration {

  @Override
  public void preInit(final SpringProcessEngineConfiguration configuration) {
    final AuthorizationProperty authorization = camundaBpmProperties.getAuthorization();
    configuration.setAuthorizationEnabled(authorization.isEnabled());
    configuration.setAuthorizationEnabledForCustomCode(authorization.isEnabledForCustomCode());
    configuration.setAuthorizationCheckRevokes(authorization.getAuthorizationCheckRevokes());

    configuration.setTenantCheckEnabled(authorization.isTenantCheckEnabled());
  }

}
