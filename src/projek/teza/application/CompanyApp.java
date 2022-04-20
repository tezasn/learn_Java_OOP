package projek.teza.application;

import projek.teza.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Teza Sulistyan Nugraha");

        Company.Employee employee = company.new Employee();
        employee.setName("Teza");

        System.out.println(employee.getCompany());
        System.out.println(employee.getName());
    }
}
