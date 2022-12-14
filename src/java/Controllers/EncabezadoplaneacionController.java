package Controllers;

import Models.Encabezadoplaneacion;
import Controllers.util.JsfUtil;
import Controllers.util.JsfUtil.PersistAction;
import Models.EncabezadoplaneacionFacade;

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

@Named("encabezadoplaneacionController")
@SessionScoped
public class EncabezadoplaneacionController implements Serializable {

    @EJB
    private Models.EncabezadoplaneacionFacade ejbFacade;
    private List<Encabezadoplaneacion> items = null;
    private Encabezadoplaneacion selected;

    public EncabezadoplaneacionController() {
    }

    public Encabezadoplaneacion getSelected() {
        return selected;
    }

    public void setSelected(Encabezadoplaneacion selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private EncabezadoplaneacionFacade getFacade() {
        return ejbFacade;
    }

    public Encabezadoplaneacion prepareCreate() {
        selected = new Encabezadoplaneacion();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("EncabezadoplaneacionCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("EncabezadoplaneacionUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("EncabezadoplaneacionDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Encabezadoplaneacion> getItems() {
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

    public Encabezadoplaneacion getEncabezadoplaneacion(java.lang.Long id) {
        return getFacade().find(id);
    }

    public List<Encabezadoplaneacion> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Encabezadoplaneacion> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Encabezadoplaneacion.class)
    public static class EncabezadoplaneacionControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            EncabezadoplaneacionController controller = (EncabezadoplaneacionController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "encabezadoplaneacionController");
            return controller.getEncabezadoplaneacion(getKey(value));
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
            if (object instanceof Encabezadoplaneacion) {
                Encabezadoplaneacion o = (Encabezadoplaneacion) object;
                return getStringKey(o.getPkEncabezadoPlaneacion());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Encabezadoplaneacion.class.getName()});
                return null;
            }
        }

    }

}
