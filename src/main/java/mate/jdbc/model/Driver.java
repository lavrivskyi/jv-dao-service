package mate.jdbc.model;

import java.util.Objects;

public class Driver {
    private Long id;
    private String name;
    private String licenseNumber;

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public Driver() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public boolean equals(Object anotherDriver) {
        if (this == anotherDriver) {
            return true;
        }
        if (anotherDriver == null || getClass() != anotherDriver.getClass()) {
            return false;
        }
        Driver driver = (Driver) anotherDriver;
        return Objects.equals(id, driver.id)
                && Objects.equals(name, driver.name)
                && Objects.equals(licenseNumber, driver.licenseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, licenseNumber);
    }

    @Override
    public String toString() {
        return "Driver{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", licenseNumber='" + licenseNumber + '\''
                + '}';
    }
}