
public class Connect {
    private String userName = "root";
    private String password = "";
    private String dBserver = "localhost";
    private String driverSGBDR= "jdbc:mysql://localhost/marieteam";
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }

    public String getdBserver() {
        return dBserver;
    }

    public String getDriverSGBDR() {
        return driverSGBDR;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setdBserver(String dBserver) {
        this.dBserver = dBserver;
    }

    public void setDriverSGBDR(String driverSGBDR) {
        this.driverSGBDR = driverSGBDR;
    }
}
