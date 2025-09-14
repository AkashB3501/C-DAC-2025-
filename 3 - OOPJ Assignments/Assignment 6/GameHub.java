
import java.util.*;

// Custom Exceptions
class GameNotFoundException extends Exception {

    public GameNotFoundException(String msg) {
        super(msg);
    }
}

class UserNotFoundException extends Exception {

    public UserNotFoundException(String msg) {
        super(msg);
    }
}

class InvalidRatingException extends Exception {

    public InvalidRatingException(String msg) {
        super(msg);
    }
}

// Abstract Game Class
abstract class Game implements Comparable<Game> {

    private static int idCounter = 1;
    private int id;
    private String name, genre;
    private int rating;
    private String platform;

    public Game(String name, String genre, int rating, String platform) throws InvalidRatingException {
        if (rating < 1 || rating > 5) 
        {
            throw new InvalidRatingException("Rating must be 1-5");
        }
        this.id = idCounter++;
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.platform = platform;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    public String getPlatform() {
        return platform;
    }

    public abstract void displayDetails();

    @Override
    public int compareTo(Game o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return String.format("ID:%d Name:%s Genre:%s Rating:%d Platform:%s", id, name, genre, rating, platform);
    }
}

// ConsoleGame subclass
class ConsoleGame extends Game {

    public ConsoleGame(String name, String genre, int rating) throws InvalidRatingException {
        super(name, genre, rating, "Console");
    }

    @Override
    public void displayDetails() {
        System.out.println(toString() + " [Console]");
    }
}

// PCGame subclass
class PCGame extends Game {

    public PCGame(String name, String genre, int rating) throws InvalidRatingException {
        super(name, genre, rating, "PC");
    }

    @Override
    public void displayDetails() {
        System.out.println(toString() + " [PC]");
    }
}

// User class
class User {

    private String username, email;
    private List<Game> borrowedGames;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.borrowedGames = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public List<Game> getBorrowedGames() {
        return borrowedGames;
    }

    public void borrowGame(Game g) {
        borrowedGames.add(g);
    }

    public void returnGame(Game g) {
        borrowedGames.remove(g);
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", username, email);
    }

    // For uniqueness in HashSet
    @Override
    public int hashCode() {
        return username.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) {
            return false;
        }
        return username.equals(((User) obj).username);
    }
}

// GameHubManager class
class GameHubManager {

    private ArrayList<Game> allGames = new ArrayList<>();
    private LinkedList<Game> borrowedQueue = new LinkedList<>();
    private HashSet<User> users = new HashSet<>();
    private HashMap<Integer, Game> gameMap = new HashMap<>();
    private HashMap<String, User> userMap = new HashMap<>();

    // Add Game
    public void addGame(Game game) {
        allGames.add(game);
        gameMap.put(game.getId(), game);
        System.out.println("Game added with ID: " + game.getId());
    }

    // Remove Game
    public void removeGame(int id) throws GameNotFoundException {
        Game game = gameMap.get(id);
        if (game == null) {
            throw new GameNotFoundException("Game not found.");
        }
        if (borrowedQueue.contains(game)) {
            System.out.println("Cannot remove: Game is borrowed.");
            return;
        }
        allGames.remove(game);
        borrowedQueue.remove(game);
        gameMap.remove(id);
        System.out.println("Game removed.");
    }

    // View Games
    public void viewGames(String sortBy) {
        List<Game> sorted = new ArrayList<>(allGames);
        if ("ID".equalsIgnoreCase(sortBy)) {
            Collections.sort(sorted); 
        }else if ("Name".equalsIgnoreCase(sortBy)) {
            sorted.sort(Comparator.comparing(Game::getName)); 
        }else if ("Rating".equalsIgnoreCase(sortBy)) {
            sorted.sort(Comparator.comparingInt(Game::getRating).reversed());
        }

        if (sorted.isEmpty()) {
            System.out.println("No games in collection.");
        } else {
            for (Game game : sorted) {
                game.displayDetails();
            }
        }
    }

    // Search Game
    public void searchGame(String keyword) {
        boolean found = false;
        for (Game game : allGames) {
            if (game.getName().equalsIgnoreCase(keyword) || game.getGenre().equalsIgnoreCase(keyword)) {
                game.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching games found.");
        }
    }

    // Register User
    public void registerUser(String username, String email) {
        if (userMap.containsKey(username)) {
            System.out.println("Duplicate username not allowed.");
            return;
        }
        User user = new User(username, email);
        users.add(user);
        userMap.put(username, user);
        System.out.println("Registered " + username);
    }

    // View Users
    public void viewUsers() {
        if (users.isEmpty()) {
            System.out.println("No users registered.");
        } else {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }

    // Issue Game
    public void issueGame(int gameID, String username) throws GameNotFoundException, UserNotFoundException {
        Game game = gameMap.get(gameID);
        if (game == null) {
            throw new GameNotFoundException("Game not found.");
        }
        if (borrowedQueue.contains(game)) {
            System.out.println("Game is already borrowed.");
            return;
        }
        User user = userMap.get(username);
        if (user == null) {
            throw new UserNotFoundException("User not found.");
        }
        borrowedQueue.add(game);
        user.borrowGame(game);
        System.out.println("Game issued to " + username);
    }

    // Return Game
    public void returnGame(int gameID, String username) throws GameNotFoundException, UserNotFoundException {
        Game game = gameMap.get(gameID);
        User user = userMap.get(username);
        if (game == null) {
            throw new GameNotFoundException("Game not found.");
        }
        if (user == null) {
            throw new UserNotFoundException("User not found.");
        }
        if (!user.getBorrowedGames().contains(game)) {
            System.out.println("This user has not borrowed this game.");
            return;
        }
        borrowedQueue.remove(game);
        user.returnGame(game);
        System.out.println("Game returned.");
    }

    // Statistics & Queue
    public void showCollectionStats() {

        System.out.println("Total Games: " + allGames.size());
        System.out.println("Available Games: " + (allGames.size() - borrowedQueue.size()));
        System.out.println("Borrowed Games: " + borrowedQueue.size());
        
    }

    public void showUserStats() {

        System.out.println("Total Registered Users: " + users.size());

    }

    public void showBorrowedQueue() {

        if (borrowedQueue.isEmpty()) 
        {
            System.out.println("No games on loan.");
        } else
        {
            System.out.println("Current borrowed games in queue:");
            for (Game g : borrowedQueue) 
            {
                System.out.println(g);
            }
        }
    }
}

// Main class
public class GameHub 
{

    public static void main(String[] args) 
    {
        GameHubManager hub = new GameHubManager();
        Scanner sc = new Scanner(System.in);

        while (true)
         {
            System.out.println("\n--- Game Hub Menu ---");
            System.out.println("1. Add Game");
            System.out.println("2. Remove Game");
            System.out.println("3. View Games");
            System.out.println("4. Search Game");
            System.out.println("5. Register User");
            System.out.println("6. View Users");
            System.out.println("7. Issue Game");
            System.out.println("8. Return Game");
            System.out.println("9. Collection Stats");
            System.out.println("10. User Stats");
            System.out.println("11. Borrowed Queue");
            System.out.println("12. Exit");
            System.out.print("Enter choice: ");
            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception ex) {
                System.out.println("Invalid input.");
                continue;
            }

            try {
                switch (choice) 
                {
                    case 1:
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Genre: ");
                        String genre = sc.nextLine();
                        System.out.print("Rating (1-5): ");
                        int rating = Integer.parseInt(sc.nextLine());
                        System.out.print("Platform (Console/PC): ");
                        String platform = sc.nextLine();
                        Game game;
                        if ("Console".equalsIgnoreCase(platform)) {
                            game = new ConsoleGame(name, genre, rating); 
                        }else if ("PC".equalsIgnoreCase(platform)) {
                            game = new PCGame(name, genre, rating); 
                        }else {
                            System.out.println("Invalid platform. Choose Console or PC.");
                            break;
                        }
                        hub.addGame(game);
                        break;

                    case 2:
                        System.out.print("Game ID: ");
                        int rid = Integer.parseInt(sc.nextLine());
                        hub.removeGame(rid);
                        break;

                    case 3:
                        System.out.print("Sort by (ID/Name/Rating): ");
                        String sort = sc.nextLine();
                        hub.viewGames(sort);
                        break;

                    case 4:
                        System.out.print("Search by Name/Genre: ");
                        String key = sc.nextLine();
                        hub.searchGame(key);
                        break;

                    case 5:
                        System.out.print("Username: ");
                        String usern = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        hub.registerUser(usern, email);
                        break;

                    case 6:
                        hub.viewUsers();
                        break;

                    case 7:
                        System.out.print("Game ID: ");
                        int gid = Integer.parseInt(sc.nextLine());
                        System.out.print("Username: ");
                        String uname = sc.nextLine();
                        hub.issueGame(gid, uname);
                        break;

                    case 8:
                        System.out.print("Game ID: ");
                        int gid2 = Integer.parseInt(sc.nextLine());
                        System.out.print("Username: ");
                        String uname2 = sc.nextLine();
                        hub.returnGame(gid2, uname2);
                        break;

                    case 9:
                        hub.showCollectionStats();
                        break;

                    case 10:
                        hub.showUserStats();
                        break;

                    case 11:
                        hub.showBorrowedQueue();
                        break;

                    case 12:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice.");
                        break;

                }

            } 
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());

            }
        }
    }
}
