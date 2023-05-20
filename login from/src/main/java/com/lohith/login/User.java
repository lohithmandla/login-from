package com.lohith.login;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_info")
public class User {
	private String name;
	private String password;
	@Id
	private String email;
	private String country;
	private String gender;

}
