package Facade;

import java.sql.Connection;

public class OracleHelper {

    public static Connection getOracleDBConnection() {
        // get Oracle DB Connection using connection parameters
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con) {
        // get data from table and generate pdf report
    }

    public void generateOracleHTMLReport(String tableName, Connection con) {
        // get data from table and generate html report
    }
}
