import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            while(true) {
                System.out.println("1. Ürün Ekle");
                System.out.println("2. Ürünleri Listele");
                System.out.println("3. Ürün Sil");
                System.out.println("4. Marka Listele");
                System.out.println("5. Çıkış");
                System.out.print("Seçiminiz: ");
                int choose = scanner.nextInt();
                scanner.nextLine();
                int storage;
                switch (choose) {
                    case 1:
                        System.out.print("Ürün Adı: ");
                        String productName = scanner.nextLine();
                        System.out.print("Birim Fiyat: ");
                        double unitPrice = scanner.nextDouble();
                        System.out.print("Stok Miktarı: ");
                        int amountStock = scanner.nextInt();
                        System.out.print("Marka ID: ");
                        int trademarkId = scanner.nextInt();
                        System.out.println("Cep Telofonu Eklemek için 1' e basın..");
                        System.out.println("Notebook  Eklemek için 2' ye basın..");
                        int chooseTech = scanner.nextInt();
                        scanner.nextLine();
                        Trademark trademark = store.getTrademarkById(trademarkId);
                        if (trademark != null) {
                            double screenSize;
                            Product phone;
                            if (chooseTech == 1) {
                                System.out.print("Depolama (GB): ");
                                storage = scanner.nextInt();
                                System.out.print("Ekran Boyutu (inç): ");
                                screenSize = scanner.nextDouble();
                                System.out.print("Kamera (MP): ");
                                int camera = scanner.nextInt();
                                System.out.print("Pil Gücü (mAh): ");
                                double battery = scanner.nextDouble();
                                scanner.nextLine();
                                phone = new Product(unitPrice, amountStock, productName, trademark, storage, screenSize, camera, battery);
                                store.addProduct(phone, chooseTech);
                            } else {
                                System.out.print("Depolama (GB): ");
                                storage = scanner.nextInt();
                                System.out.print("RAM (GB): ");
                                int ram = scanner.nextInt();
                                System.out.print("Ekran Boyutu (inç): ");
                                screenSize = scanner.nextDouble();
                                scanner.nextLine();
                                phone = new Product(unitPrice, amountStock, productName, trademark, storage, screenSize, ram);
                                store.addProduct(phone, chooseTech);
                            }

                            System.out.println("Urun Eklendi");
                        } else {
                            System.out.println("Geçersiz marka ID");
                        }
                        break;
                    case 2:
                        store.listProduct();
                        break;
                    case 3:
                        System.out.println("Silmek istediğiniz ürünü seçin");
                        storage = scanner.nextInt();
                        store.removeProduct(storage);
                        System.out.println("Urun Silindi");
                        break;
                    case 4:
                        store.listTrademark();
                        break;

                    case 5:
                        System.out.println("Programdan çıkılıyor...");
                        System.exit(0);
                    default:
                        System.out.println("Geçersiz Seçim...");
                }
            }
        }
    }
}