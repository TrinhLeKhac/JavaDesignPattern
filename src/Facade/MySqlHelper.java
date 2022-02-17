package Facade;

import java.sql.Connection;

public class MySqlHelper {

    public static Connection getMySqlDBConnection() {
        // get Mysql DB connection using connection parameters
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con) {
        // get data from table and gererate pdf report
    }

    public void generateSqlHTMLReport(String tableName, Connection con) {
        // get data from table and generate html report
    }
}
