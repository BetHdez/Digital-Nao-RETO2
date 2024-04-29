public class AController {
    private AModel model;
    private AView view;

    public AController(AModel model, AView view) {
        this.model = model;
        this.view = view;
    }

    public void fetchAData() {
        try {
            String aInfo = model.fetchDataFromGoogleScholar();
            view.printAInfo(aInfo);
        } catch (Exception e) {
            view.printErrorMessage(e.getMessage());
        }
    }
}

