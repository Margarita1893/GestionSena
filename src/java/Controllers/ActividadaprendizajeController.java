package Controllers;

import Models.Actividadaprendizaje;
import Controllers.util.JsfUtil;
import Controllers.util.JsfUtil.PersistAction;
import Models.ActividadaprendizajeFacade;

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

@Named("actividadaprendizajeController")
@SessionScoped
public class ActividadaprendizajeController implements Serializable {

    @EJB
    private Models.ActividadaprendizajeFacade ejbFacade;
    private List<Actividadaprendizaje> items = null;
    private Actividadaprendizaje selected;

    public ActividadaprendizajeController() {
    }

    public Actividadaprendizaje getSelected() {
        return selected;
    }

    public void setSelected(Actividadaprendizaje selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private ActividadaprendizajeFacade getFacade() {
        return ejbFacade;
    }

    public Actividadaprendizaje prepareCreate() {
        selected = new Actividadaprendizaje();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("ActividadaprendizajeCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("ActividadaprendizajeUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("ActividadaprendizajeDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Actividadaprendizaje> getItems() {
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

    public Actividadaprendizaje getActividadaprendizaje(java.lang.Long id) {
        return getFacade().find(id);
    }

    public List<Actividadaprendizaje> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Actividadaprendizaje> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Actividadaprendizaje.class)
    public static class ActividadaprendizajeControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ActividadaprendizajeController controller = (ActividadaprendizajeController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "actividadaprendizajeController");
            return controller.getActividadaprendizaje(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Actividadaprendizaje) {
                Actividadaprendizaje o = (Actividadaprendizaje) object;
                return getStringKey(o.getPkActividadAprendizaje());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Actividadaprendizaje.class.getName()});
                return null;
            }
        }

    }

}
