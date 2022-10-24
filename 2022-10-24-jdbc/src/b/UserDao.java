package b;

// Data Access Object
public interface UserDao {

	int create(User user);

	User read(int id);

	void update(User user);

	void delete(int id);

}
