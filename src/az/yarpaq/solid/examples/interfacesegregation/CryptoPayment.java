package az.yarpaq.solid.examples.interfacesegregation;

public interface CryptoPayment {
    void payWithCrypto(String walletAddress, double amount);
}
