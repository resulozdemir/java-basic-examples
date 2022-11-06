package Java102.Ornek2;
//interfaceler basında I harfi ile tanımlanir

public interface IBanka {
    final String hostIpAddress = "127.0.0.1";

    boolean connect(String ipAddress);
    boolean peyment(double price,String cardNumber,String expiryDate,String cvc);



}
