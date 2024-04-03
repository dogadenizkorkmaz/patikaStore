import java.util.*;
public class PatikaStore {
    private List<Brand> brands;
    private List<MobilePhone> phones;
    private List<Notebook> notebooks;
    Scanner input;

    public PatikaStore() {
        this.brands = new ArrayList<>();
        this.phones = new ArrayList<>();
        this.notebooks = new ArrayList<>();
        input = new Scanner(System.in);

        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));
        Collections.sort(brands);
    }

    public boolean showMenu() {
        System.out.println("###### PatikaStore Ürün Yönetim Paneli ######");
        while (true) {
            System.out.println("1 - Add NoteBook");
            System.out.println("2 - Add Mobile Phone");
            System.out.println("3 - Delete Product");
            System.out.println("4 - List Brands");
            System.out.println("0 - Exit");
            System.out.print("Please select an action: ");
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.out.print("Exiting..");
                    return false;
                case 1:
                    System.out.println("Adding Notebook");
                    addProduct(1);
                    listProducts();
                    break;
                case 2:
                    System.out.println("Adding Cell Phone");
                    addProduct(2);
                    listProducts();
                    break;
                case 3:
                    System.out.println("Deleting Product");
                    System.out.print("Please select the product to delete: ");
                    int removeId = input.nextInt();
                    deleteProduct(removeId);
                    listProducts();
                    break;
                case 4:
                    System.out.println("Brands");
                    listBrands();
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }

    public void listBrands() {
        for (Brand brand : brands) {
            System.out.println(brand.getName());
        }
    }

    public void addProduct(int choice) {

        System.out.print("Ürün adı giriniz : ");
        String name = input.next();
        input.nextLine();

        System.out.print("Ürün adet fiyatını giriniz : ");
        double unitPrice = input.nextDouble();
        System.out.print("Stok adetini giriniz : ");
        int stockCount = input.nextInt();
        System.out.print("İndirim oranını giriniz : ");
        double discountRate = input.nextDouble();
        input.nextLine();

        System.out.print("Rengini giriniz : ");
        String color = input.next();
        System.out.print("Marka ID'si giriniz : ");
        int brandId = input.nextInt();
        Brand brand = getBrandById(brandId);
        if (brand != null) {
            if (choice == 1) {
                System.out.print("Ekran Boyutu: ");
                double screenSize = input.nextDouble();
                System.out.print("RAM: ");
                int ram = input.nextInt();
                System.out.print("Depolama: ");
                int storage = input.nextInt();

                Notebook notebook = new Notebook(name, unitPrice, discountRate, stockCount, brand, color, screenSize, ram, storage);
                addNotebook(notebook);
            } else if (choice == 2) {
                System.out.print("Hafıza: ");
                int memory = input.nextInt();
                System.out.print("Ekran Boyutu: ");
                double screenSize = input.nextDouble();
                System.out.print("Pil Gücü: ");
                int battery = input.nextInt();
                System.out.print("RAM: ");
                int ram = input.nextInt();

                MobilePhone phone = new MobilePhone(name, unitPrice, discountRate, stockCount, brand,memory, screenSize, battery, ram, color);
                addMobilePhone(phone);
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    public Brand getBrandById(int id) {
        for (Brand brand : brands) {
            if (brand.getId() == id) {
                return brand;
            }
        }
        return null;
    }

    public void addNotebook(Notebook notebook) {
        if (notebook != null) {
            notebooks.add(notebook);
        }
    }

    public void addMobilePhone(MobilePhone phone) {
        if (phone != null) {
            phones.add(phone);
        }
    }

    public void deleteProduct(int productId) {
        notebooks.removeIf(notebook -> notebook.getId() == productId);
        phones.removeIf(phone -> phone.getId() == productId);
    }

    public void listProducts() {
        System.out.println("NoteBook Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-3s | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |%n",
                "ID", "Ürün Adı", "Fiyat", "İndirim", "Stok",
                "Marka", "Renk", "Ekran", "RAM", "Depolama");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (Notebook notebook : notebooks) {
            System.out.format("| %-3d | %-20s | %-10.1f | %-10.1f | %-10d | %-10s | %-10s | %-10.1f | %-10d | %-10d |%n",
                    notebook.getId(), notebook.getName(), notebook.getUnitPrice(), notebook.getDiscountRate(), notebook.getStockCount(),
                    notebook.getBrand().getName(), notebook.getColor(), notebook.getScreenSize(), notebook.getRam(), notebook.getStorage());
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        }
        System.out.println("CepTelefonu Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-3s | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |%n",
                "ID", "Ürün Adı", "Fiyat", "İndirim", "Stok",
                "Marka", "Hafıza", "Ekran", "RAM", "Pil Gücü");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (MobilePhone phone : phones) {
            System.out.format("| %-3d | %-20s | %-10.1f | %-10.1f | %-10d | %-10s | %-10s | %-10.1f | %-10d | %-10d | %-10d |%n",
                    phone.getId(), phone.getName(), phone.getUnitPrice(), phone.getDiscountRate(), phone.getStockCount(),
                    phone.getBrand().getName(), phone.getMemory(), phone.getScreenSize(), phone.getRam(), phone.getBattery());
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}