package Controllers;

import Models.Estrategiasdidacticasactivas;
import Controllers.util.JsfUtil;
import Controllers.util.JsfUtil.PersistAction;
import Models.EstrategiasdidacticasactivasFacade;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("estrategiasdidacticasactivasController")
@SessionScoped
public class EstrategiasdidacticasactivasController implements Serializable {

    @EJB
    private Models.EstrategiasdidacticasactivasFacade ejbFacade;
    private List<Estrategiasdidacticasactivas> items = null;
    private Estrategiasdidacticasactivas selected;

    public EstrategiasdidacticasactivasController() {
    }

    public Estrategiasdidacticasactivas getSelected() {
        return selected;
    }

    public void setSelected(Estrategiasdidacticasactivas selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private EstrategiasdidacticasactivasFacade getFacade() {
        return ejbFacade;
    }

    public Estrategiasdidacticasactivas prepareCreate() {
        selected = new Estrategiasdidacticasactivas();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("EstrategiasdidacticasactivasCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("EstrategiasdidacticasactivasUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("EstrategiasdidacticasactivasDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Estrategiasdidacticasactivas> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Estrategiasdidacticasactivas getEstrategiasdidacticasactivas(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Estrategiasdidacticasactivas> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Estrategiasdidacticasactivas> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Estrategiasdidacticasactivas.class)
    public static class EstrategiasdidacticasactivasControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            EstrategiasdidacticasactivasController controller = (EstrategiasdidacticasactivasController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "estrategiasdidacticasactivasController");
            return controller.getEstrategiasdidacticasactivas(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Estrategiasdidacticasactivas) {
                Estrategiasdidacticasactivas o = (Estrategiasdidacticasactivas) object;
                return getStringKey(o.getPkEstrategiasDdacticasActivas());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Estrategiasdidacticasactivas.class.getName()});
                return null;
            }
        }

    }

}
