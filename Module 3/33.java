import java.sql.*;

public class AccountTransfer {
    Connection conn;

    public AccountTransfer() throws Exception {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdb", "root", "password");
    }

    public void transfer(int fromId, int toId, double amount) throws Exception {
        try {
            conn.setAutoCommit(false);
            PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
            PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
            debit.setDouble(1, amount);
            debit.setInt(2, fromId);
            credit.setDouble(1, amount);
            credit.setInt(2, toId);
            debit.executeUpdate();
            credit.executeUpdate();
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            throw e;
        }
    }
}
