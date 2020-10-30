
package DAO;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Msv Wangley
 */
public interface Dao<T> {
    public T get(int id);
    public List<T> getAll();
    public void save(T t);
    public void update(T t);
    public void delete(T t);
}
