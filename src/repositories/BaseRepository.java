package repositories;

import models.BaseModel;

import java.sql.Connection;
import java.sql.DriverManager;

public interface BaseRepository<T extends BaseModel> {
    void create(T model);
    void update(T model);
    void read();
    void delete(T model);
    default void connect(){
                try {

            Connection connection = DriverManager.getConnection(urlToDb, user, password);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(testQuery);

            while (resultSet.next()) {
                System.out.println(resultSet.getString(2));
            }


        } catch (Exception e) {
            System.out.println(" some thing went wrong ");
            e.printStackTrace();
        }
    }
}
