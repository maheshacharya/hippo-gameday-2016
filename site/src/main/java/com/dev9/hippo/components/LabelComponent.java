package com.dev9.hippo.components;


import org.apache.commons.lang.StringUtils;
import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;

/**
 * Created by maheshacharya on 9/12/16.
 */
@ParametersInfo(type = LabelComponentInfo.class)
public class LabelComponent extends BaseHstComponent {

    @Override
    public void doBeforeRender(HstRequest request, HstResponse response) throws HstComponentException {
        super.doBeforeRender(request, response);
        LabelComponentInfo info = getComponentParametersInfo(request);
        request.setAttribute("info", info);
        if (StringUtils.isNotEmpty(info.getDocument())) {
            HippoBean bean = request.getRequestContext().getSiteContentBaseBean().getBean(info.getDocument());
            request.setAttribute("document", bean);

        }

    }
}
