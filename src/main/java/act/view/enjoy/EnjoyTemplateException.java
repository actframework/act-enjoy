package act.view.enjoy;

import act.app.SourceInfo;
import org.osgl.util.E;

import java.util.List;

public class EnjoyTemplateException extends act.view.TemplateException {

    public EnjoyTemplateException(Exception t) {
        super(t);
    }

    @Override
    protected void populateSourceInfo(Throwable t) {
        E.tbd();
    }

    @Override
    public String errorMessage() {
        throw E.tbd();
    }

    @Override
    public List<String> stackTrace() {
        throw E.tbd();
    }

    @Override
    protected boolean isTemplateEngineInvokeLine(String s) {
        throw E.tbd();
    }

    private static class RockerSourceInfo extends SourceInfo.Base {
        // TODO
    }
}
