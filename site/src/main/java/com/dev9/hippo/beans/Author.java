package com.dev9.hippo.beans;

/*
 * Copyright 2014 Hippo B.V. (http://www.onehippo.com)
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

import java.util.List;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.onehippo.cms7.essentials.components.model.AuthorEntry;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImage;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;

@HippoEssentialsGenerated(internalName = "gamedayproject:author")
@Node(jcrType = "gamedayproject:author")
public class Author extends HippoDocument implements AuthorEntry {

    public static final String ROLE = "gamedayproject:role";
    public static final String ACCOUNTS = "gamedayproject:accounts";
    public static final String FULL_NAME = "gamedayproject:fullname";
    public static final String IMAGE = "gamedayproject:image";
    public static final String CONTENT = "gamedayproject:content";

    @HippoEssentialsGenerated(internalName = "gamedayproject:fullname")
    public String getFullName() {
        return  getProperty(FULL_NAME);
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:content")
    public HippoHtml getContent() {
        return getHippoHtml(CONTENT);
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:role")
    public String getRole() {
        return getProperty(ROLE);
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:image")
    public HippoGalleryImage getImage() {
        return getLinkedBean(IMAGE, HippoGalleryImage.class);
    }

  	@HippoEssentialsGenerated(internalName = "gamedayproject:accounts")
	  public List<Account> getAccounts() {
		    return getChildBeansByName(ACCOUNTS, Account.class);
	  }
}
