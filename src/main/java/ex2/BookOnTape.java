package ex2;

public class BookOnTape extends Thing {
    private Long serialNumber ;
    private String name;
    private String price;

    public BookOnTape(Long serialNumber, String name, String price) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.price = price;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "BookOnTape{" +
                "serialNumber=" + serialNumber +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
