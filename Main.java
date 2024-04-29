public class Main {
    public static void main(String[] args) {
        String aId = "Xahj4nQAAAAJ";
        AModel model = new AModel(aId);
        AView view = new AView();
        AController controller = new AController(model, view);

        controller.fetchAData();
    }
}
