import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Cristian
 * @version 1.0.0
 * @since 05/06/2020 - 01:05
 * @category modal
 */
public class GameStoreArray implements GameStoreInterface {
    List<GameStore> storedGames = new ArrayList();

    public GameStoreArray() {
    }

    /**
     * Register a game on this store of games
     * @param game the games toString
     */
    public void register(GameStore game) {
        this.storedGames.add(game);
    }

    /**
     * The list of game in the store
     * @return list of games
     */
    public List<GameStore> search() {
        return this.storedGames;
    }

    /**
     * Delete the game of store
     * @param index the name of game
     */
    public void delete(int index) {
        this.storedGames.remove(index);
    }

    /**
     * Edit a game in the store
     * @param index
     * @param game
     */
    public void edit(int index, GameStore game) {
        this.storedGames.add(index, game);
    }

    /**
     * Filter a game in store
     * @param game
     * @param filter
     * @return the game you choice to show in the store
     */
    public GameStore filter(GameStore game, int filter) {
        Iterator var3;
        GameStore gamess;
        switch (filter) {
        case 1:
            var3 = this.storedGames.iterator();
            do {
                if(!var3.hasNext()) {
                    return null;
                }

                gamess = (GameStore)var3.next();
            } while(!gamess.getNameOfGame().contains(game.getNameOfGame()));

            return gamess;
        case 2:
            var3 = this.storedGames.iterator();

            do {
                if(!var3.hasNext()) {
                    return null;
                }

                gamess =(GameStore)var3.next();
            } while(gamess.getNameOfGame() != game.getNameOfGame());

            return gamess;
        default:
            return null;
        }
    }

    /**
     *Return number of games in the store
     * @return all games register on store
     */
    public int stockAmount() {
        return this.storedGames.size();
    }

    /**
     * Clear all games in the store
     */
    public void clearStock() {
        this.storedGames.clear();
    }
}
