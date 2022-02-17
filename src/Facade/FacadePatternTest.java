package Facade;

import Facade.HelperFacade.*;
import java.sql.Connection;

public class FacadePatternTest {

    public static void main(String[] args) {
        String tableName = "Employee";

        // generating MySql HTML report and Oracle PDF report without using Facade
        Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateSqlHTMLReport(tableName, con);

        Connection con1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, con);

        // generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(DBTypes.MYSQL,ReportTypes.HTML, tableName);
        HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.PDF, tableName);
    }
}
