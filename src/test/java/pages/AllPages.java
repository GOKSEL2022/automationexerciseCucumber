package pages;
public class AllPages {
    public AllPages() {
    }
    private AllProductsPage allProductsPage;
    private AccountCreatedPage accountCreatedPage;
    private CheckoutPage checkoutPage;
    private ContactPage contactPage;
    private LoginPage loginPage;
    private OrderPlacedPage orderPlacedPage;
    private PaymentPage paymentPage;
    private ProductDetailsPage productDetailsPage;
    private SignupPage signupPage;

    public SignupPage signupPage() {
        if (signupPage == null) {
            signupPage = new SignupPage();
        }
        return signupPage;
    }

    public ProductDetailsPage productDetailsPage() {
        if (productDetailsPage == null) {
            productDetailsPage = new ProductDetailsPage();
        }
        return productDetailsPage;
    }

    public PaymentPage paymentPage() {
        if (paymentPage == null) {
            paymentPage = new PaymentPage();
        }
        return paymentPage;
    }

    public OrderPlacedPage orderPlacedPage() {
        if (orderPlacedPage == null) {
            orderPlacedPage = new OrderPlacedPage();
        }
        return orderPlacedPage;
    }

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public ContactPage contactPage() {
        if (contactPage == null) {
            contactPage = new ContactPage();
        }
        return contactPage;
    }

    public CheckoutPage checkoutPage() {
        if (checkoutPage == null) {
            checkoutPage = new CheckoutPage();
        }
        return checkoutPage;
    }

    public AllProductsPage allProductsPage() {
        if (allProductsPage == null) {
            allProductsPage = new AllProductsPage();
        }
        return allProductsPage;
    }
    public AccountCreatedPage accountCreatedPage() {
        if (accountCreatedPage == null) {
            accountCreatedPage = new AccountCreatedPage();
        }
        return accountCreatedPage;
    }
}
