package com.dev9.hippo.components;

import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.configuration.channel.ChannelInfo;
import org.hippoecm.hst.configuration.hosting.Mount;
import org.hippoecm.hst.content.beans.ObjectBeanManagerException;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maheshacharya on 9/12/16.
 */
public class BaseComponent extends BaseHstComponent {

    private static Logger logger = LoggerFactory.getLogger(BaseComponent.class);

    @Override
    public void doBeforeRender(HstRequest request, HstResponse response) throws HstComponentException {
        super.doBeforeRender(request, response);
        Mount mount = request.getRequestContext().getResolvedMount().getMount();
        WebsiteInfo info = mount.getChannelInfo();
        request.setAttribute("channelInfo", info);

        String logoPath =  info.getLogoPath();
        Object logo = null;
        try {
            logo = getObjectBeanManager(request).getObject(logoPath);
            request.setAttribute("logo", logo);

        } catch (ObjectBeanManagerException e) {
            logger.warn("Error", e);
        }
    }
}
