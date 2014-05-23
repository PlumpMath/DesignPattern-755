package mediator;

/**
 * Mediator concrete class
 */
public class Mediator implements IMediator {

    BtnView btnView;
    BtnSearch btnSearch;
    BtnBook btnBook;
    LblDisplay show;

    @Override
    public void book() {
        btnBook.setEnabled(false);
        btnView.setEnabled(true);
        btnSearch.setEnabled(true);
        show.setText("Booking...");
    }

    @Override
    public void view() {
        btnView.setEnabled(false);
        btnSearch.setEnabled(true);
        btnBook.setEnabled(true);
        show.setText("Viewing...");
    }

    @Override
    public void search() {
        btnSearch.setEnabled(false);
        btnBook.setEnabled(true);
        btnView.setEnabled(true);
        show.setText("Searching...");
    }

    @Override
    public void registerView(BtnView btnView) {
        this.btnView = btnView;
    }

    @Override
    public void registerSearch(BtnSearch btnSearch) {
        this.btnSearch = btnSearch;
    }

    @Override
    public void registerBook(BtnBook btnBook) {
        this.btnBook = btnBook;
    }

    @Override
    public void registerDisplay(LblDisplay show) {
        this.show = show;
    }
}
