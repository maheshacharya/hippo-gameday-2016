package com.dev9.hippo.beans;
/*
 * Copyright 2014-2015 Hippo B.V. (http://www.onehippo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;

@HippoEssentialsGenerated(internalName = "gamedayproject:contentdocument")
@Node(jcrType = "gamedayproject:contentdocument")
public class ContentDocument extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "gamedayproject:introduction")
    public String getIntroduction() {
        return getProperty("gamedayproject:introduction");
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:title")
    public String getTitle() {
        return getProperty("gamedayproject:title");
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:content")
    public HippoHtml getContent() {
        return getHippoHtml("gamedayproject:content");
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:publicationdate")
    public Calendar getPublicationDate() {
        return getProperty("gamedayproject:publicationdate");
    }
}
