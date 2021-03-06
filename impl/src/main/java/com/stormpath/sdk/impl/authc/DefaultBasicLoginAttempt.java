/*
 * Copyright 2013 Stormpath, Inc.
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
package com.stormpath.sdk.impl.authc;

import com.stormpath.sdk.impl.ds.InternalDataStore;
import com.stormpath.sdk.impl.resource.AbstractResource;
import com.stormpath.sdk.impl.resource.Property;
import com.stormpath.sdk.impl.resource.StringProperty;

import java.util.Map;

/**
 * @since 0.2
 */
public class DefaultBasicLoginAttempt extends AbstractResource implements BasicLoginAttempt {

    static final StringProperty TYPE = new StringProperty("type");
    static final StringProperty VALUE = new StringProperty("value");

    private static final Map<String, Property> PROPERTY_DESCRIPTORS = createPropertyDescriptorMap(TYPE, VALUE);

    public DefaultBasicLoginAttempt(InternalDataStore dataStore) {
        super(dataStore);
    }

    public DefaultBasicLoginAttempt(InternalDataStore dataStore, Map<String, Object> properties) {
        super(dataStore, properties);
    }

    @Override
    public Map<String, Property> getPropertyDescriptors() {
        return PROPERTY_DESCRIPTORS;
    }

    @Override
    public String getType() {
        return getString(TYPE);
    }

    @Override
    public void setType(String type) {
        setProperty(TYPE, type);
    }

    @Override
    public String getValue() {
        return getString(VALUE);
    }

    @Override
    public void setValue(String value) {
        setProperty(VALUE, value);
    }
}
