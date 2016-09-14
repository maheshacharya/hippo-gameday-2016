package com.dev9.hippo.components;

import com.dev9.hippo.beans.RosterDocument;
import org.apache.commons.lang.StringUtils;
import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.content.beans.query.HstQuery;
import org.hippoecm.hst.content.beans.query.HstQueryResult;
import org.hippoecm.hst.content.beans.query.exceptions.QueryException;
import org.hippoecm.hst.content.beans.query.filter.Filter;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.Item;
import javax.jcr.LoginException;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.jcr.query.QueryResult;
import java.util.List;

/**
 * Created by maheshacharya on 9/10/16.
 */
@ParametersInfo(type = RosterCalloutComponentInfo.class)
public class RosterCalloutComponent extends BaseHstComponent {
    Logger logger = LoggerFactory.getLogger(RosterCalloutComponent.class);

    @Override
    public void doBeforeRender(HstRequest request, HstResponse response) throws HstComponentException {
        super.doBeforeRender(request, response);
        RosterCalloutComponentInfo info = getComponentParametersInfo(request);
        request.setAttribute("info", info);
        if (StringUtils.isNotEmpty(info.getRosterFolder())) {

            try {
                HippoBean bean = request.getRequestContext().getSiteContentBaseBean().getBean(info.getRosterFolder());

                HstQuery query = request.getRequestContext().getQueryManager().createQuery(
                        bean, RosterDocument.class, true);
                query.setLimit(500);
                Filter filter = query.createFilter();
                query.addOrderByAscending("gamedayproject:number");
                HstQueryResult results = query.execute();
                query.setFilter(filter);
                request.setAttribute("results", results.getHippoBeans());

            } catch (QueryException e) {

                logger.warn("QueryException", e);
           /* } catch (PathNotFoundException e) {
                logger.warn("PathNotFoundException", e);
            } catch (LoginException e) {
                logger.warn("LoginException", e);
            } catch (RepositoryException e) {
                logger.warn("RepositoryException", e);*/
            }

        }

    }
}
