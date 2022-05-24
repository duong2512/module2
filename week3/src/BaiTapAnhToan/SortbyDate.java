package BaiTapAnhToan;

import java.util.Comparator;

public class SortbyDate implements Comparator<Nguoi> {
    @Override
    public int compare(Nguoi o1, Nguoi o2) {
        if (o1.getNgaySinh().before(o2.getNgaySinh())){
            return 1;
        } else return -1;
    }
}
