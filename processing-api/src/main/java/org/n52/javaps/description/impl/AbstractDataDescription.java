/*
 * Copyright 2016 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.javaps.description.impl;

import java.util.Objects;

import org.n52.javaps.description.DataDescription;
import org.n52.javaps.io.data.IData;

/**
 *
 * @author Christian Autermann
 */
public abstract class AbstractDataDescription extends AbstractDescription implements DataDescription {

    private final Class<? extends IData> bindingClass;

    public AbstractDataDescription(AbstractDataDescriptionBuilder<?, ?> builder) {
        super(builder);
        this.bindingClass = Objects.requireNonNull(builder.getBindingClass());
    }

    @Override
    public Class<? extends IData> getBindingClass() {
        return this.bindingClass;
    }


}
