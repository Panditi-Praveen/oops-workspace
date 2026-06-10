package com.java.abstraction;

public class Main {
    static void main(String[] args) {
        Customer customer = new Customer(1,"customer1","customer1@gmail.com",8309957523L,"12347689007654");
        ApplicationForm applicationForm = new ApplicationForm(1,"Birth Certificate",customer);
        Mro mro = new Mro(1,"praveen",1000);
        Attender attender = new Attender(1000,"charan",mro);
        CertificateService certificateService = new CertificateServiceImpl(attender);
        Certificate certificate = certificateService.getCertificate(applicationForm);
        PrintService printService = new NormalPrintService();
        printService.PrintCertificate(certificate);

    }
}
