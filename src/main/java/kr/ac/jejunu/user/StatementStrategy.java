package kr.ac.jejunu.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface StatementStrategy {
    public PreparedStatement makeStatement(Object obj, Connection connection) throws SQLException;
}