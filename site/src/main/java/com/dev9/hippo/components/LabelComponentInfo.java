package com.dev9.hippo.components;

import org.hippoecm.hst.core.parameters.*;

/**
 * Created by maheshacharya on 9/12/16.
 */
@FieldGroupList({
        @FieldGroup(
                titleKey = "Resource Bundle Label",
                value = {"bundleName", "labelKey"}
        ),
        @FieldGroup(
                titleKey = "Custom Styling",
                value = { "useCustomStyle" , "fontSize", "bold", "fontColor", "cssStyle", "cssClassName"}
        )
})
public interface LabelComponentInfo {

    @Parameter(name = "bundleName", displayName = "Bundle Name")
    String getBundleName();

    @Parameter(name = "labelKey", displayName = "Label Key")
    String getLabelKey();

    @Parameter(name = "useCustomStyle", displayName = "Use Custom Style")
    boolean getUseCustomStyle();

    @Parameter(name = "fontSize", displayName = "Font Size")
    int getFontSize();

    @Parameter(name = "bold", displayName = "Bold")
    boolean getBold();

    @Parameter(name = "fontColor", displayName = "Font Color")
    @Color
    String getFontColor();

    @Parameter(name = "cssStyle", displayName = "CSS Style")
    String getCssStyle();

    @Parameter(name = "cssClassName", displayName = "CSS Class Name")
    String getCssClassName();

    @Parameter(name = "document", displayName = "Style Document")
    @JcrPath(
            pickerInitialPath = "/content/documents/gamedayproject/html-content",
            pickerRemembersLastVisited = true,
            isRelative = true,
            pickerSelectableNodeTypes = "gamedayproject:htmldocument",
            pickerConfiguration = "cms-pickers/documents-only")
    String getDocument();

}
