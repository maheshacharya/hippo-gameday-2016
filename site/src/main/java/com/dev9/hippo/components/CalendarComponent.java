package com.dev9.hippo.components;

import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;

import javax.jcr.RepositoryException;


@ParametersInfo(type = CalendarComponentInfo.class)
public class CalendarComponent extends BaseHstComponent {

    @Override
    public void doBeforeRender(HstRequest request, HstResponse response) {
        super.doBeforeRender(request, response);

        HippoBean bean = request.getRequestContext().getContentBean();

        if(bean!=null){
            try {
                String name = bean.getNode().getName();
            } catch (RepositoryException e) {
                e.printStackTrace();
            }
        }

        CalendarComponentInfo info = getComponentParametersInfo(request);
        if (info != null) {
            request.setAttribute("info", info);
            request.setAttribute("now", System.currentTimeMillis());
        }

    }


}
