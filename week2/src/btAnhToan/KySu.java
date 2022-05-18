package btAnhToan;

import java.sql.Date;

public class KySu extends CanBo{
    private String NganhDaoTao ;

    public KySu(){
    }

    public KySu(String nganhDaoTao) {
        NganhDaoTao = nganhDaoTao;
    }

    public KySu(String name, Date date, String gender, String address, String nganhDaoTao) {
        super(name, date, gender, address);
        NganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        NganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return super.toString() + "KySu{" +
                "NganhDaoTao='" + NganhDaoTao + '\'' +
                '}';
    }
}
