/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.mgt.store.connector.ldap.connector.factory;

import org.wso2.carbon.identity.mgt.connector.IdentityStoreConnector;
import org.wso2.carbon.identity.mgt.connector.IdentityStoreConnectorFactory;
import org.wso2.carbon.identity.mgt.store.connector.ldap.connector.LDAPIdentityStoreConnector;

/**
 * LDAP based identity store connector factory.
 */
public class LDAPIdentityStoreConnectorFactory implements IdentityStoreConnectorFactory {

    @Override
    public IdentityStoreConnector getInstance() {
        return new LDAPIdentityStoreConnector();
    }
}