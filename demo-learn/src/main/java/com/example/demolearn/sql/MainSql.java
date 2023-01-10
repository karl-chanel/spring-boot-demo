package com.example.demolearn.sql;

import com.zaxxer.hikari.HikariDataSource;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2023-01-09 17:09
 **/
public class MainSql {

    private static HikariDataSource dataSource;

    public static void main(String[] args) throws SQLException, IOException {
//        String JDBC_URL = "jdbc:mysql://47.57.68.189:3306/learnjdbc";
//        String JDBC_USER = "root";
//        String JDBC_PASSWORD = "123456";
//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl(JDBC_URL);
//        config.setUsername(JDBC_USER);
//        config.setPassword(JDBC_PASSWORD);
//        config.addDataSourceProperty("connectionTimeout", "1000"); // 连接超时：1秒
//        config.addDataSourceProperty("idleTimeout", "60000"); // 空闲超时：60秒
//        config.addDataSourceProperty("maximumPoolSize", "10"); // 最大连接数：10
//        MainSql.dataSource = new HikariDataSource(config);
//        HikariDataSource dataSource = MainSql.dataSource;
//        try (Connection conn = dataSource.getConnection()) {
//            try (Statement stmt = conn.createStatement()) {
//                try (ResultSet rs = stmt.executeQuery("SELECT id, grade, name, gender,score FROM students WHERE gender=1")) {
//                    while (rs.next()) {
//                        long id = rs.getLong(1); // 注意：索引从1开始
//                        long grade = rs.getLong(2);
//                        String name = rs.getString(3);
//                        int gender = rs.getInt(4);
//                        int score = rs.getInt(5);
//                        System.out.println(id+" "+gender+" "+name+" "+gender+" "+score);
//                    }
//                }
//            }
//        }
//        List<String> props = List.of("profile=native", "debug=true", "logging=warn", "interval=500");
//        Map<String, String> map = props.stream()
//            // 把k=v转换为Map[k]=v:
//            .map(kv -> {
//                String[] ss = kv.split("\\=", 2);
//                return Map.of(ss[0], ss[1]);
//            })
//            // 把所有Map聚合到一个Map:
//            .reduce(new HashMap<String, String>(), (m, kv) -> {
//                m.putAll(kv);
//                return m;
//            });
//        // 打印结果:
//        map.forEach((k, v) -> {
//            System.out.println(k + " = " + v);
//        });


        List<String> list = List.of("Apple", "Banana", "Blackberry", "Coconut", "Avocado", "Cherry", "Apricots");
        Map<String, List<String>> groups = list.stream()
            .collect(Collectors.groupingBy(s -> s.substring(0, 1), Collectors.toList()));
        System.out.println(groups);
    }
//        try (Connection conn = dataSource.getConnection()) {
//            try (PreparedStatement ps = conn.prepareStatement(
//                "INSERT INTO students (grade, name, gender,score) VALUES (?,?,?,?)",Statement.RETURN_GENERATED_KEYS))
//            {
//                ps.setObject(1, 0); // grade
//                ps.setObject(2, "amy"); // name
//                ps.setObject(3, 1); // gender
//                ps.setObject(4,100);
//                int n = ps.executeUpdate(); // 1
//                try (ResultSet rs = ps.getGeneratedKeys()) {
//                    if (rs.next()) {
//                        long id = rs.getLong(1);
//                        System.out.println(id);// 注意：索引从1开始
//                    }
//                }
//            }
//        }
//        try (Connection conn = dataSource.getConnection()) {
//            try (PreparedStatement ps = conn.prepareStatement("UPDATE students SET name=? WHERE id=?")) {
//                ps.setObject(1, "Bob"); // 注意：索引从1开始
//                ps.setObject(2, 1002);
//                int n = ps.executeUpdate(); // 返回更新的行数
//            }
//        }
//    }
}
