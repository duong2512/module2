public class Student1 {
        private String name="John";
        private String lop="C0322G1";

        public Student1() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLop() {
            return lop;
        }

        public void setLop(String lop) {
            this.lop = lop;
        }

    public static void main(String[] args) {
        Student1 s1=new Student1();
        System.out.println(s1.getName());
        System.out.println(s1.getLop());
        s1.setName("Duong");
        s1.setLop("C03");
        System.out.println(s1.getName());
        System.out.println(s1.getLop());
    }
    }

