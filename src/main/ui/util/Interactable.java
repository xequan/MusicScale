package main.ui.util;

/**
 * @author team A on 3/31/2016.
 * Interface for getting and returning user input
 */
public interface Interactable {
    public void SetDisplay(Displayable display);
    public void SetValidator(Validatable validator);
    public String requestString();
}
