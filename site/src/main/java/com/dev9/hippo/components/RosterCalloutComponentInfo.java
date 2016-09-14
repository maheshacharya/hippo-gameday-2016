package com.dev9.hippo.components;

import org.hippoecm.hst.core.parameters.JcrPath;
import org.hippoecm.hst.core.parameters.Parameter;

/**
 * Created by maheshacharya on 9/10/16.
 */
public interface RosterCalloutComponentInfo {
    @Parameter(name = "rosterFolder", displayName = "Roster Folder")
    @JcrPath(pickerInitialPath = "/content/documents/gamedayproject",
            pickerRemembersLastVisited = true,
            isRelative = true,
            pickerSelectableNodeTypes = "hippostd:folder",
            pickerConfiguration = "cms-pickers/folders")
    String getRosterFolder();
}
