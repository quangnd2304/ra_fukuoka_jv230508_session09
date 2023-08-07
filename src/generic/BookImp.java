package generic;

public class BookImp<U> implements IGenericDemo<U>{
    @Override
    public void create(U obj) {
        System.out.println("Created "+obj);
    }

    @Override
    public void update(U obj) {
        System.out.println("Updated "+obj);
    }

    @Override
    public void delete(U obj) {
        System.out.println("Deleted "+obj);
    }
}
