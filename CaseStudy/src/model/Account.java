package model;

import java.io.Serializable;

public class Account implements Serializable {
        private String userName;
        private String passName;
        private String email;
        private String role;

        public Account() {
        }

        public Account(String userName, String passName, String email, String role) {
            this.userName = userName;
            this.passName = passName;
            this.email = email;
            this.role = role;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassName() {
            return passName;
        }

        public void setPassName(String passName) {
            this.passName = passName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "userName=" + userName +
                    ", passName=" + passName +
                    ", email=" + email +
                    ", role=" + role ;
        }
    }
