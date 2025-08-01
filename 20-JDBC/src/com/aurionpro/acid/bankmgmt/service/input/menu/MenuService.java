package com.aurionpro.acid.bankmgmt.service.input.menu;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MenuService {

    // For CUSTOMER role with accountId
    public static void redirectToCustomerMenu(Connection conn, int accountId, Scanner sc) throws SQLException {
        CustomerMenuService.showCustomerMenu(conn, accountId,sc);
    }

    // For ADMIN role
    public static void redirectToAdminMenu(Connection conn, Scanner sc) throws SQLException {
        AdminMenuService.showAdminMenu(conn,sc);
    }
}
