package za.co.cor;

/**
 *
 * @author hmanganyi
 */
public class NewMain {

    BranchManager branchManager;
    ReginalManager reginalManager;
    VicePresident vice;
    PresidentCOO coo;

    public static void main(String[] args) {

        NewMain main = new NewMain();
        main.createAuthorizationFlow();
        PurchaseRequest request = new PurchaseRequest(23, "pencils", 3000000);
        main.branchManager.authorize(request);
    }

    private void createAuthorizationFlow() {

        branchManager = new BranchManager("Hundzukani");
        reginalManager = new ReginalManager("Dzunani");
        vice = new VicePresident("Lyn");
        coo = new PresidentCOO("Hosana");

        branchManager.setNextHandler(reginalManager);
        reginalManager.setNextHandler(vice);
        vice.setNextHandler(coo);
    }
}
