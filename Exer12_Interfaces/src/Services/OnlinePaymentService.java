package Services;

public interface OnlinePaymentService {

	// Taxa de pagamento
	double paymentFee(double amount);
	// Juros
	double interest(double amount, int months);
}
