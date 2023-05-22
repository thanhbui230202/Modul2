package case_study.repository.Interface;

public interface IEmployeeRepository extends Repository{
    @Override
    default void write() {

    }

    @Override
    default void read() {

    }
}
