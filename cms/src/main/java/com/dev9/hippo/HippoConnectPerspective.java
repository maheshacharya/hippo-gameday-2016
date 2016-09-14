package com.dev9.hippo;

import org.apache.wicket.event.IEvent;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.flow.RedirectToUrlException;
import org.apache.wicket.request.resource.CssResourceReference;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.request.resource.ResourceReference;
import org.hippoecm.frontend.plugin.IPluginContext;
import org.hippoecm.frontend.plugin.config.IPluginConfig;
import org.hippoecm.frontend.plugins.standards.perspective.Perspective;
import org.hippoecm.repository.HippoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;


public class HippoConnectPerspective extends Perspective {

    private static String GAMEDAY_DEV_TWEETS = "https://twitter.com/search?f=tweets&q=%23hippoconnectgameday-Dev";
    private static final ResourceReference PERSPECTIVE_CSS =
            new CssResourceReference(HippoConnectPerspective.class, "HippoConnectPerspective.css");

    private static final ResourceReference PERSPECTVE_JS =
            new JavaScriptResourceReference(HippoConnectPerspective.class, "HippoConnectPerspective.js");


    private static HippoRepository repo;
    private static Logger logger = LoggerFactory.getLogger(HippoConnectPerspective.class);

    private String redirectServer = "http://ec2-54-175-108-167.compute-1.amazonaws.com:8080/site/redirect";

    public HippoConnectPerspective(IPluginContext context, IPluginConfig config) {
        super(context, config);
        setOutputMarkupId(true);

        //redirectServer = config.getString("redirect.server");

        final Model m = new Model("");
        TextField text = new TextField("textfield", m, String.class);
        this.add(text);


        Form<?> essentials = new Form<Void>("essentials") {

            @Override
            protected void onSubmit() {
                throw new RedirectToUrlException("http://" + ((HttpServletRequest) getRequest().getContainerRequest()).getServerName() + ":8080/essentials");

            }

        };

        Form<?> form = new Form<Void>("form-rebuild") {

            @Override
            protected void onSubmit() {


            }

        };

        Form<?> tweets = new Form<Void>("tweets") {

            @Override
            protected void onSubmit() {
                throw new RedirectToUrlException(GAMEDAY_DEV_TWEETS);

            }

        };

        this.add(essentials);



        form.add(text);

        this.add(form);
        this.add(tweets);

        add(new Label("perspective-heading", "Hippo Connect Boston 2016 | Gameday | Control Panel"));
        form.add(new Button("submit", Model.of("Submit")) {

            private static final long serialVersionUID = 1L;

            @Override
            public void onSubmit() {

                try {
                    File file = new File("../../run.sh");
                    logger.info("Shell Location :" + new File("../../").getCanonicalFile());
                    Runtime.getRuntime().exec(file.getCanonicalPath(), null, new File("../../").getCanonicalFile());

                } catch (Exception e) {
                    logger.warn("Error", e);
                } finally {
                    HttpServletRequest request = (HttpServletRequest) getRequest().getContainerRequest();
                    throw new RedirectToUrlException(redirectServer + "?referer=" + request.getServerName());
                }

            }


        });


    }

    @Override
    protected void onActivated() {
        super.onActivated();

    }

    @Override
    public void renderHead(final IHeaderResponse response) {
        response.render(CssHeaderItem.forReference(PERSPECTIVE_CSS));
        response.render(CssHeaderItem.forUrl("https://fonts.googleapis.com/css?family=Roboto+Condensed"));
        response.render(JavaScriptHeaderItem.forReference(PERSPECTVE_JS));
    }

}