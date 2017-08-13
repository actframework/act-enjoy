package act.view.enjoy;

import act.app.App;
import act.util.ActContext;
import act.view.Template;
import act.view.View;
import org.osgl.util.E;

import java.util.List;

public class EnjoyView extends View {

    public static final String ID = "enjoy";

    private String suffix;

    @Override
    public String name() {
        return ID;
    }

    @Override
    protected Template loadTemplate(String resourcePath, ActContext context) {
        throw E.tbd();
    }

    @Override
    protected void init(final App app) {
        E.tbd();
    }

    public List<String> loadContent(String template) {
        throw E.tbd();
    }

}
