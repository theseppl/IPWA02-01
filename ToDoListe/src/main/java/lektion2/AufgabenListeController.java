package lektion2;

import java.io.Serializable;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named("controller")
@ViewScoped
public class AufgabenListeController
             implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String startEdit() {
        return "editierbar";
    }
    
    public String stopEdit() {
        return "aufgabenliste";
    }
}
