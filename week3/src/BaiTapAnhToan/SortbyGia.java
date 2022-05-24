package BaiTapAnhToan;

import java.util.Comparator;
import java.util.concurrent.Callable;

public class SortbyGia  implements Comparator<KhachSan> {

    @Override
    public int compare(KhachSan o1, KhachSan o2) {
        if(o1.getGiaPhong()>o2.getGiaPhong()){
            return 1;
        } else return -1;
    }
}
