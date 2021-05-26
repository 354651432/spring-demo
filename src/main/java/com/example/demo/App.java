package com.example.demo;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

import com.example.demo.models.User;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.orm.hibernate5.HibernateTemplate;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		// SpringApplication.run(App.class, args);

		var hb = new HibernateTemplate();
		hb.get(User.class, 20);
	}
}
