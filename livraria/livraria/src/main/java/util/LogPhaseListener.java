package util;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import modelo.Usuario;

public class LogPhaseListener implements PhaseListener {

    @Override
    public void afterPhase(PhaseEvent event) {
        FacesContext context = event.getFacesContext();
        String pagina = context.getViewRoot().getViewId();

        if ("/login.xhtml".equals(pagina)) {
            return;
        }

        Usuario usuarioLogado = (Usuario) context.getExternalContext().getSessionMap().get("usuarioLogado");

        if (usuarioLogado != null) {
            return;
        }

        NavigationHandler handler = context.getApplication().getNavigationHandler();
        handler.handleNavigation(context, null, "/login?faces-redirect=true");
        context.renderResponse();
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        System.out.println("FASE B: " + event.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

}
