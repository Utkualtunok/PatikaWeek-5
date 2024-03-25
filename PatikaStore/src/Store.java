import java.util.*;
public class Store {
    private List<Trademark> trademarks = new ArrayList<>();
    private List<Product> phone = new ArrayList<>();
    private List<Product> noteBooks = new ArrayList<>();

    public Store(){
        this.trademarks.add(new Trademark(1,"Apple"));
        this.trademarks.add(new Trademark(2,"Asus"));
        this.trademarks.add(new Trademark(3,"Casper"));
        this.trademarks.add(new Trademark(4,"HP"));
        this.trademarks.add(new Trademark(5,"Huawei"));
        this.trademarks.add(new Trademark(6,"Lenovo"));
        this.trademarks.add(new Trademark(7,"Monster"));
        this.trademarks.add(new Trademark(8,"Samsung"));
        this.trademarks.add(new Trademark(9,"Xiaomi"));
        this.trademarks.sort(Comparator.comparing(Trademark :: getName));
    }

    public void addProduct(Product product, int chooseTech){
        if (product instanceof Product){
            Iterator var3 = this.trademarks.iterator();

            while (var3.hasNext()){
                Trademark trademark = (Trademark)var3.next();
                if (product.getTrademark().getName().equals(trademark.getName())){
                    if (chooseTech == 1){
                        this.phone.add(product);
                    } else {
                        this.noteBooks.add(product);
                    }
                    break;
                }
            }
        }
    }

    public void removeProduct (int productId){
        this.phone.removeIf((product -> { return product.getId() == productId;}));
        this.noteBooks.removeIf((product -> { return product.getId() == productId;}));
    }

    public void listProduct(){
        System.out.println("Notebook Listesi");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM  ");
        System.out.println("----------------------------------------------------------------------------------------------------");
        Iterator var1 = this.noteBooks.iterator();

        Product product;
        while (var1.hasNext()){
            product = (Product)var1.next();
            System.out.format("| %-2d | %-30s | &-9.1f TL | %-9s | &-10d | %-6.1f | %-11d |\n", product.getId(), product.getProductName(),product.getUnitPrice(),product.getTrademark().getName(), product.getStorage(), product.getScreenSize(), product.getRam());
        }

        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("\nCep Telefonu Listesi ");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera     | Pil     | RAM   ");
        System.out.println("----------------------------------------------------------------------------------------------------");
        var1 = this.phone.iterator();

        while (var1.hasNext()){
            product = (Product)var1.next();
            System.out.format("| %-2d | %-30s | &-9.1f TL | %-9s | &-10d | %-6.1f | %-9d | %-9.1f | &-9d | %-9s |\n", product.getId(),product.getUnitPrice(),product.getTrademark().getName(), product.getStorage(), product.getScreenSize(), product.getCamera(), product.getBattery(), product.getRam(), product.getColor());

        }

        System.out.println("----------------------------------------------------------------------------------------------------");
    }
    public void listTrademark(){
        System.out.println("| ID | Marka Adı  |");
        Iterator var1 = this.trademarks.iterator();

        while (var1.hasNext()){
            Trademark trademark = (Trademark)var1.next();
            System.out.format("| %-1d  | %-1s     |\n", trademark.getId(),trademark.getName());
        }
    }

    public Trademark getTrademarkById(int id){
        Iterator var2 = this.trademarks.iterator();

        Trademark trademark;
        do {
            if (!var2.hasNext()){
                return null;
            }
            trademark = (Trademark) var2.next();
        } while (trademark.getId() != id);
        return trademark;
    }
}
