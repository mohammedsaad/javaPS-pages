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
package org.n52.javaps.ogc.ows;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

import org.n52.iceland.i18n.MultilingualString;

/**
 * TODO JavaDoc
 *
 * @author Christian Autermann
 */
public abstract class OwsDescription {

    private final Optional<MultilingualString> title;
    private final Optional<MultilingualString> abstrakt;
    private final Set<OwsKeyword> keywords;

    public OwsDescription(MultilingualString title,
                          MultilingualString abstrakt,
                          Set<OwsKeyword> keywords) {
        this.title = Optional.ofNullable(title);
        this.abstrakt = Optional.ofNullable(abstrakt);
        this.keywords = keywords == null ? Collections.emptySet() : keywords;
    }

    public Optional<MultilingualString> getTitle() {
        return title;
    }

    public Optional<MultilingualString> getAbstract() {
        return abstrakt;
    }

    public Set<OwsKeyword> getKeywords() {
        return Collections.unmodifiableSet(keywords);
    }

}
