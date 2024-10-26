package corp;

import corp.storage.ConnectionProvider;

import corp.cli.CliFSM;
import corp.storage.Storage;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        ConnectionProvider connectionProvider = new ConnectionProvider();
        Storage storage = Storage.getInstance();

        new CliFSM(connectionProvider);

        connectionProvider.close();
    }
}