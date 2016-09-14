package com.dev9.hippo.components;

import org.hippoecm.hst.core.parameters.FieldGroup;
import org.hippoecm.hst.core.parameters.FieldGroupList;
import org.hippoecm.hst.core.parameters.JcrPath;
import org.hippoecm.hst.core.parameters.Parameter;

/**
 * Created by maheshacharya on 9/9/16.
 */

public interface TwitterComponentInfo {

    @Parameter(name = "document", displayName = "Twitter Widget Document")
    @JcrPath(
            pickerInitialPath = "/content/documents/gamedayproject/html-content",
            pickerRemembersLastVisited = true,
            isRelative = true,
            pickerSelectableNodeTypes = "gamedayproject:htmldocument",
            pickerConfiguration = "cms-pickers/documents-only")
    String getDocument();

}
