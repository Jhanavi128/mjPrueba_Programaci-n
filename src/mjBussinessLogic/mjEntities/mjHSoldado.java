package mjBussinessLogic.mjEntities;

public class mjHSoldado extends mjHormiga {
    @Override
    public boolean vive(String alimento, String genoma) {
        return false;
    }

    @Override
    public String toString() {
        return "mjHSoldado {}";
    }
}
