import chessman.Board;
import chessman.King;
import org.json.JSONObject;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        King a = new King(1);
        JSONObject chess_statue = new JSONObject().put("a", a);
        Board game = new Board();
    }
}
