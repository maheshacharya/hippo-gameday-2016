package com.dev9.hippo.components;

import org.apache.commons.lang.StringUtils;
import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;

/**
 * Created by maheshacharya on 9/9/16.
 */
@ParametersInfo(type = TwitterComponentInfo.class)
public class TwitterComponent extends BaseHstComponent {

    @Override
    public void doBeforeRender(HstRequest request, HstResponse response) throws HstComponentException {
        super.doBeforeRender(request, response);
        TwitterComponentInfo info = getComponentParametersInfo(request);
        request.setAttribute("info", info);
        if (StringUtils.isNotEmpty(info.getDocument())) {
            request.setAttribute("document", request.getRequestContext().getSiteContentBaseBean().getBean(info.getDocument()));
        }
    }
}
