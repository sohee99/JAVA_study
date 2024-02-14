package Java_study.generic.Inherit_Implement;

public class StorageImplExample {
    public static void main(String[] args) {
        ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
        product.setKind(new Tv());
        product.setModel("SmartTv");
        product.setCompany("Samsoong");

        Storage<Tv> storage = new StorageImpl<>(100);
        storage.add(new Tv(), 0);
    }
}
