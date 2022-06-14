import java.util.Comparator;

public class SortTangDan implements  Comparator <SanPham> {

    @Override
    public int compare(SanPham o1, SanPham o2) {
        if (o1.getPrice() > o2.getPrice()) return 1;
        else return -1;
    }
}
