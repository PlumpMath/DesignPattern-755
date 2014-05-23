package mediator;

/**
 * Mediator interface
 */
public interface IMediator {
    public void book();
    public void view();
    public void search();
    public void registerView(BtnView v);
    public void registerSearch(BtnSearch s);
    public void registerBook(BtnBook b);
    public void registerDisplay(LblDisplay b);
}
