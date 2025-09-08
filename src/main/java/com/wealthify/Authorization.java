public class AccountService {
    public void deleteAccount(String accountId) {
        // Anyone who calls this method can delete accounts
        System.out.println("Account " + accountId + " deleted!");
    }
}
