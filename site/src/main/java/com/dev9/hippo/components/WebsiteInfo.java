package com.dev9.hippo.components;

import org.hippoecm.hst.configuration.channel.ChannelInfo;
import org.hippoecm.hst.core.parameters.*;

@FieldGroupList({
        @FieldGroup(
                titleKey = "fields.channel",
                value = {"logo", "webFont"}
        )
})
public interface WebsiteInfo extends ChannelInfo {
    @Parameter(name = "logo")
    @JcrPath(
            pickerSelectableNodeTypes = {"hippogogreengallery:imageset"},
            pickerInitialPath = "/content/gallery/logos"
    )
    String getLogoPath();

    @Parameter(name = "webFont", defaultValue = "")
    String getwebFont();


}