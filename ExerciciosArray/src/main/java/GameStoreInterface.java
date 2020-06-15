import java.util.List;

/**
 * @author Cristian
 * @version 1.0.0
 * @since 05/06/2020 - 01:05
 * @category interface
 */
public interface GameStoreInterface {
    void register(GameStore var1);

    List<GameStore> search();

    void delete(int var1);

    void edit(int var1, GameStore var2);

    GameStore filter(GameStore var1, int var2);

    int stockAmount();

    void clearStock();
}