/**
 * Created by Joshua on 10/10/2017.
 */
public class Controller {
    public static void main(String[] args) {
        DrawingEntity[] drawings = new DrawingEntity[3];

        drawings[0] = new Line();
        drawings[1] = new Circle();
        drawings[2] = new Box();

        for(DrawingEntity d : drawings) {
            d.display();
        }
    }
}
