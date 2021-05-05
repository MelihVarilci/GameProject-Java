package Utilities;

public interface BaseCrudOperation<T> {
	public void add(T entity);

	public void update(T entity);

	public void delete(T entity);

}
