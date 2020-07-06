package main.creational.object_pool;

import java.sql.Connection;

/**
 * Object pooling can offer a significant performance boost;
 * it is most effective in situations where the cost of initializing a class instance is high,
 * the rate of instantiation of a class is high, and the number of instantiations in use at any one time is low.
 */
public class ObjectPoolDemo {

    public static void main(String args[]) {
        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");

        // Get a connection:
        Connection con = pool.checkOut();

        // Use the connection
        // Return the connection:
        pool.checkIn(con);
    }
}
