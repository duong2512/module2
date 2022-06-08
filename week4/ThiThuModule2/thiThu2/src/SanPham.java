public class SanPham {
    private String msp;
    private String name;
    private double price;
    private int num;
    private String describe;

    public SanPham() {
    }

    public SanPham(String msp, String name, double price, int num, String describe) {
        this.msp = msp;
        this.name = name;
        this.price = price;
        this.num = num;
        this.describe = describe;
    }

    public String getMsp() {
        return msp;
    }

    public void setMsp(String msp) {
        this.msp = msp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "msp=" + msp +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", describe='" + describe + '\'' +
                '}';
    }

    public String write(){
        return msp + "," + name + "," + price + "," + num + "," + "," + describe ;
    }
}
